package com;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@Slf4j
public class consumerTest {
    @Value("${rocketmq.product_group}")
    private  String PRODUCER_GROUP;
    @Value("${rocketmq.nameserver_addr}")
    private  String NAMESRV_ADDR;
    @Value("${rocketmq.topic}")
    private  String TOPIC;
    @Value("${rocketmq.tags}")
    private  String TAGS;

    @Test
    public void comsumer() throws MQClientException, InterruptedException {
        DefaultMQPushConsumer mqPushConsumer = new DefaultMQPushConsumer(PRODUCER_GROUP);
        mqPushConsumer.setNamesrvAddr(NAMESRV_ADDR);
        mqPushConsumer.subscribe(TOPIC,"*");
        mqPushConsumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs , ConsumeConcurrentlyContext context){
                log.info("消费消息条数：{}",msgs.size());
                for (MessageExt msg : msgs) {
                    System.out.println(new String(msg.getBody()));
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        mqPushConsumer.start();
        Thread.sleep(100000);
    }
}
