package com.my.cloud.consul.consumer.controller;

import com.my.cloud.consul.consumer.config.Service;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 功能描述：
 *
 * @author gaofeng
 * @date 2020/9/28 下午6:15
 * @since 1.0.0
 */
@RestController
@RequestMapping("/proxy")
public class RibbonController {

    @Resource(name = "ribbonRestTemplate")
    private RestTemplate ribbonRestTemplate;

    @RequestMapping("/time")
    public String orderIndex(HttpServletRequest request) {
        StringBuilder sb = new StringBuilder();
        sb.append("http://").append(Service.CLOUD_CONSUL_PROVIDER).append("/time");
        return ribbonRestTemplate.getForObject(sb.toString(), String.class);
    }
}
