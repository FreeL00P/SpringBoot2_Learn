package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RequestController
 *
 * @author fj
 * @date 2022/9/21 22:12
 */
@Controller
public class RequestController {
    @RequestMapping("/goto")
    public String  goToPage(HttpServletRequest request){
        request.setAttribute("msg","SUCCESS");
        request.setAttribute("code",200);
        return "forward:/success";
    }
    @ResponseBody
    @RequestMapping("/success")
    public Map<String, Object> sussess(@RequestAttribute("msg") String msg,
                                       @RequestAttribute("code") Integer code,
                                       HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        Object code1 = request.getAttribute("code");
        Object msg1 = request.getAttribute("msg");
        map.put("msg",msg);
        map.put("code", code);
        map.put("msg1",msg1);
        map.put("code1",code1);
        return map;
    }
    //获取矩阵变量中的值
    @ResponseBody
    @GetMapping("/cars/{path}")
    public Map carsSell(@MatrixVariable("low") Integer low,
                        @MatrixVariable("brand")List<String> brand,
                        @PathVariable("path") String path){
        Map<String, Object> map = new HashMap<>();
        map.put("low",low);
        map.put("brand",brand);
        map.put("path",path);
        return map;
    }
}
