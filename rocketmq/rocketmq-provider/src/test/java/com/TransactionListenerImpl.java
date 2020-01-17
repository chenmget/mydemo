package com;

import org.apache.rocketmq.client.producer.LocalTransactionState;
import org.apache.rocketmq.client.producer.TransactionListener;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.HashMap;
import java.util.Map;

public class TransactionListenerImpl implements TransactionListener {
    private static Map<String, LocalTransactionState> STATE_MAP = new HashMap();

    @Override
    public LocalTransactionState executeLocalTransaction(Message msg, Object o) {
        try {
            System.out.println("用户A账户减500元.");
            Thread.sleep(500); //模拟调用服务
            //System.out.println(1/0);
            System.out.println("用户B账户加500元.");
            Thread.sleep(800);
            STATE_MAP.put(msg.getTransactionId() , LocalTransactionState.COMMIT_MESSAGE);
            Thread.sleep(100000);
            System.out.println("二次确认提交");
            // 二次提交确认
            return LocalTransactionState.COMMIT_MESSAGE;
        } catch (Exception e) {
            e.printStackTrace();
        }
        STATE_MAP.put(msg.getTransactionId() , LocalTransactionState.ROLLBACK_MESSAGE);
        // 回滚
        return LocalTransactionState.ROLLBACK_MESSAGE;
    }

    @Override
    public LocalTransactionState checkLocalTransaction(MessageExt msg) {
        System.out.println("调用回查");
        return STATE_MAP.get(msg.getTransactionId());
    }
}
