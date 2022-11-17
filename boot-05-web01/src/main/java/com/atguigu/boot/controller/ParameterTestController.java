package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ParameterTestController
 *
 * @author fj
 * @date 2022/9/21 20:41
 */
@RestController
public class ParameterTestController {
    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String username,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader Map<String, String> headers,
                                     @RequestParam("age") Integer age,
                                     @RequestParam("inters") List<String> inters,
                                     @RequestParam Map<String,String> params
//                                     @CookieValue("_ga") String _ga ,
//                                     @CookieValue("cookie") Cookie cookie
                                 ){
        Map<String, Object> map = new HashMap<>( );
        map.put("id",id);
        map.put("name", username);
        map.put("pv",pv);//所有PathVariable值
        map.put("userAgent",userAgent);//获取请求头中的User-Agent
        map.put("header",headers);//获取请求头的所有信息\
        map.put("age",age);
        map.put("inter",inters);
        map.put("params",params);
//        map.put("_ga",_ga);
//        System.out.println(cookie);
        return map;
    }

    //Post
    @PostMapping("/save")
    public Map postMenthod(@RequestBody String content){
        Map<String, Object> map = new HashMap<>( );
        map.put("content",content);
        return map;
    }
}
