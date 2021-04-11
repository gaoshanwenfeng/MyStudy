package com.my.cloud.consul.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述：
 *
 * @author gaofeng
 * @date 2020/9/28 下午5:58
 * @since 1.0.0
 */
@Configuration
public class RestConfig {

    @Bean("ribbonRestTemplate")
    @LoadBalanced
    public RestTemplate getRibbonRestTemplate() {
        /*
         * 构造函数 ClientHttpRequestFactory 的Sub-Class
         * HttpComponentsClientHttpRequestFactory
         * SimpleClientHttpRequestFactory
         * OkHttp3ClientHttpRequestFactory
         */
        return new RestTemplate(new SimpleClientHttpRequestFactory());
    }

    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
