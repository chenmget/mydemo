package com.demo;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

public class Consumer {
    private static final String PRODUCER_GROUP = "test-group";
    private static final String NAMESRV_ADDR = "192.168.2.38:9876";
    private static final String TOPIC = "topicTest";
    private static final String TAGS = "tag";

    public static void main(String[] args) throws MQClientException {

        DefaultMQPushConsumer mqPushConsumer = new DefaultMQPushConsumer(PRODUCER_GROUP);

        mqPushConsumer.setNamesrvAddr(NAMESRV_ADDR);
        mqPushConsumer.subscribe(TOPIC,"tag");

        mqPushConsumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs , ConsumeConcurrentlyContext context){

                for (MessageExt msg : msgs) {
                    System.out.println(System.currentTimeMillis()+"---"+new String(msg.getBody()));
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        mqPushConsumer.start();
    }
}
