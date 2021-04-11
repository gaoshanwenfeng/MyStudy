package com.my.consul.service.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能描述：
 *
 * @author gaofeng
 * @date 2021/4/11 下午1:06
 */
@Slf4j
@SpringBootApplication
public class BootConsulServiceProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootConsulServiceProviderApplication.class, args);
        log.info("Thea service starts success ....... Welcome...");
    }
}
