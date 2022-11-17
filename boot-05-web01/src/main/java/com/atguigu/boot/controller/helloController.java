package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * helloController
 *
 * @author fj
 * @date 2022/9/20 18:57
 */
@RestController
public class helloController {
    @RequestMapping("1.jpg")
    public String helloWorld() {
        return "hello";
    }
    @RequestMapping("/index")
    public String Cindex() {
        return "Cindex.html";
    }
}
