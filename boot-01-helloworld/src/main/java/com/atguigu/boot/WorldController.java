package com.atguigu.boot;

import com.atguigu.boot.baen.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/18 22:15    since 1.0.0
 */
@Slf4j()
@RestController
public class WorldController {

    @RequestMapping("/w")
    public String world(){
        log.info("请求进来了......");
        return "Hello Spring Boot 2 JreBEl ";
    }

}
