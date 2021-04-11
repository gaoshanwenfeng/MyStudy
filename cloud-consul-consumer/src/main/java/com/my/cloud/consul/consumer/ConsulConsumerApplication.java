package com.my.cloud.consul.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 功能描述：
 *
 * @author gaofeng
 * @date 2021/4/11 下午5:23
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerApplication.class, args);
        log.info("The service starts successfully。。。Welcome。。");
    }
}
