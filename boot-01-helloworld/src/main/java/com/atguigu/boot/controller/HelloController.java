package com.atguigu.boot.controller;

import com.atguigu.boot.baen.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/18 21:28    since 1.0.0
 */
//@ResponseBody
//@Controller

@RestController
public class HelloController {
    @Autowired
    Car car;
    @RequestMapping("/hello")
    public String handle01(){
        return "Hello SpringBoot2";
    }

    @RequestMapping("/car")
    public Car car(){
        return car;
    }
}
