package com.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
    private final static Logger logger = LoggerFactory.getLogger(LogTest.class);
    public static void main(String[] args) {
       logger.info("logbak成功啦");
       logger.warn("logbak成功啦");
       logger.error("logbak成功啦");
    }
}
