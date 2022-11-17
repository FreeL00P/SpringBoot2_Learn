package com.atguigu.admin.controller;

import com.atguigu.admin.bean.Account;
import com.atguigu.admin.bean.User;
import com.atguigu.admin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * IndexController
 *
 * @author fj
 * @date 2022/9/22 13:02
 */
@Controller
public class IndexController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private AccountService accountService;

    @GetMapping(value={"/","/login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String login(User user, HttpSession session, Model model) {
        //判断用户名与密码的有效性
        if ((!StringUtils.isEmpty(user.getUsername())) && "123456".equals(user.getPassword())
            && StringUtils.hasLength(user.getPassword())){
            session.setAttribute("loginUser",user);
            //登陆成功重定向到main.html
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号或密码错误");
            return "login";
        }

    }
    //登陆成功后 刷新页面相当于重新提交表单
    //所以需要把刷新做一个请求
    @GetMapping("/main.html")
    public String mainPager(HttpSession session,Model model){
//        if (session.getAttribute("loginUser")!=null){
//            return "main";
//        }else {
//
//            model.addAttribute("msg","请重新登陆");
//            return "login";
//        }
        return "main";
    }
    @ResponseBody
    @GetMapping("/sql")
    public String queryFromDb(){
        Long along = jdbcTemplate.queryForObject("select count(*)  from t_user", Long.class);
        return along.toString();

    }
    @ResponseBody
    @GetMapping("/acct")
    public Account getBYId(Long id){
        Account acct = accountService.getAcctById(id);
        return acct;
    }
}

