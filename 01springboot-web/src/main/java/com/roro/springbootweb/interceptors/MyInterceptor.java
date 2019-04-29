package com.roro.springbootweb.interceptors;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**拦截器*/
@Component
public class MyInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
        System.out.println("我是MyInterceptor的preHandle方法");
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,@Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("我是MyInterceptor的postHandle方法");

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,@Nullable Exception ex) throws Exception {
        System.out.println("我是MyInterceptor的afterCompletion方法");
    }
}