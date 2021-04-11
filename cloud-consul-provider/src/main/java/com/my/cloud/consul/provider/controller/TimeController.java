package com.my.cloud.consul.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * 功能描述：
 *
 * @author gaofeng
 * @date 2021/4/11 下午5:45
 */
@RestController
public class TimeController {

    @RequestMapping("/time")
    public String time(){
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.toString();
    }
}
