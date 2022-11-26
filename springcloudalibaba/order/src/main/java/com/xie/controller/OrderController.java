package com.xie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author xiehu
 * @Date 2022/9/7 21:30
 * @Version 1.0
 * @Description
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功！");
        String msg = restTemplate.getForObject("http://localhost:8081/stock/reduct", String.class);
        System.out.println("返回成功====");
        return "hello world"+msg;
    }
}