package com.atguifu.boot.controller;

import com.atguifu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * helloController
 *
 * @author fj
 * @date 2022/9/19 11:16
 */
@RestController()
public class helloController {
    @Autowired
    private Person person;
    @RequestMapping("/")
    public Person person(){
        return person;
    }
}
