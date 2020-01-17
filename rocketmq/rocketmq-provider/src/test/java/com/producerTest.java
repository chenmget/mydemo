package com;

import com.config.RocketMqConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.TransactionMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@Slf4j
public class producerTest {

    @Autowired
    private RocketMqConfig rocketMqConfig;

    @Value("${rocketmq.product_group}")
    private  String PRODUCER_GROUP;
    @Value("${rocketmq.nameserver_addr}")
    private  String NAMESRV_ADDR;
    @Value("${rocketmq.topic}")
    private  String TOPIC;
    @Value("${rocketmq.tags}")
    private  String TAGS;

    @Test
    public void  testConfig(){
        System.out.println(rocketMqConfig.getNameserverAddr());
        System.out.println(rocketMqConfig.getProductGroup());
        System.out.println(rocketMqConfig.getTags());
        System.out.println(rocketMqConfig.getTopic());

        System.out.println(PRODUCER_GROUP);
        System.out.println(NAMESRV_ADDR);
        System.out.println(TOPIC);
        System.out.println(TAGS);
    }

    /**
     * 同步发送者
     * @throws MQClientException
     * @throws UnsupportedEncodingException
     * @throws RemotingException
     * @throws InterruptedException
     * @throws MQBrokerException
     */
    @Test
    public void SynProducer() throws MQClientException, UnsupportedEncodingException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer producer = new DefaultMQProducer();
        producer.setProducerGroup(PRODUCER_GROUP);
        producer.setNamesrvAddr(NAMESRV_ADDR);
        //消息发送失败时，重试3次
        producer.setRetryTimesWhenSendFailed(3);
        producer.start();
        Long startTime = System.currentTimeMillis();
        log.info("start time {}", startTime);
        Message msg = new Message();
        msg.setBody("this is synProducer".getBytes(RemotingHelper.DEFAULT_CHARSET));
        msg.setTopic(TOPIC);
        msg.setTags(TAGS);

        producer.send(msg);
        System.out.println(msg);
        log.info("end time {}",System.currentTimeMillis() );
        log.info("use time {}",System.currentTimeMillis() - startTime);
        producer.shutdown();
    }

    @Test
    public void AsynProducer() throws MQClientException, UnsupportedEncodingException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer producer = new DefaultMQProducer(PRODUCER_GROUP);
        producer.setNamesrvAddr(NAMESRV_ADDR);
        producer.start();
        Message msg = new Message();
        msg.setTags(TAGS);
        msg.setTopic(TOPIC);
        msg.setBody("this is asynProducer".getBytes("utf-8"));
        producer.send(msg , new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult){
                System.out.println("异步发送消息成功!");
                System.out.println(sendResult);
            }
            @Override
            public void onException(Throwable e){
                System.out.println("异步发送消息失败!");
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        });
        Thread.sleep(100000);
        producer.shutdown();
    }


    @Test
    public void TransactionProducer () throws MQClientException, UnsupportedEncodingException, RemotingException, InterruptedException, MQBrokerException {
        TransactionMQProducer  producer = new TransactionMQProducer(PRODUCER_GROUP);
        producer.setNamesrvAddr(NAMESRV_ADDR);
        //设置监听
        producer.setTransactionListener(new TransactionListenerImpl());
        producer.start();
        Message msg = new Message();
        msg.setTags(TAGS);
        msg.setTopic(TOPIC);
        msg.setBody("this is transProducer".getBytes("utf-8"));
        producer.sendMessageInTransaction(msg,null);
        Thread.sleep(100000);
        producer.shutdown();
    }
}
