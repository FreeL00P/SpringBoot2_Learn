package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import javax.servlet.http.HttpServletRequest;

/**
 * ViewTestController
 *
 * @author fj
 * @date 2022/9/22 11:26
 */
@Controller
public class ViewTestController {
    @GetMapping("/success")
    public String sussess(Model model){
        model.addAttribute("context","成功了...");
        model.addAttribute("link","https://www.baidu.com");
        return "success";
    }
}
