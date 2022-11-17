package com.atguigu.admin.interceptor;

import com.atguigu.admin.bean.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import lombok.extern.slf4j.Slf4j;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * LoginInterceptor
 *
 * @author fj
 * @date 2022/9/22 22:01
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //拦截请求 判断是否登录
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("loginUser");
        if (user!=null) return true;
        //添加返回信息
        session.setAttribute("msg","你尚未登录");
        //重新定向到登录页面
//        response.sendRedirect("/login");
        request.getRequestDispatcher("/").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
       log.info("postHandle执行{}",modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
       log.info("afterCompletion()执行异常 {}",ex);
    }
}
