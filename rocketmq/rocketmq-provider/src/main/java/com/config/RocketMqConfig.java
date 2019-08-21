package com.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "rocketmq")
@Data
public class RocketMqConfig {
    private String nameserverAddr;
    private String topic;
    private String tags;
    private String productGroup;
}
