package com;

import com.config.RocketMqConfig;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
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
public class configTest {

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
    public void SynProducer() throws MQClientException, UnsupportedEncodingException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer producer = new DefaultMQProducer();
        producer.setProducerGroup(PRODUCER_GROUP);
        producer.setNamesrvAddr(NAMESRV_ADDR);
        producer.start();

        Message msg = new Message();
        msg.setBody("this is synProducer".getBytes(RemotingHelper.DEFAULT_CHARSET));
        msg.setTags(TOPIC);
        msg.setTags(TAGS);

        producer.send(msg);
        System.out.println(msg);
        producer.shutdown();
    }
}
