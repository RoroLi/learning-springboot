package com.roro.springbootweb.config;

import com.roro.springbootweb.filter.MyFilter;
import com.roro.springbootweb.interceptors.MyInterceptor;
import com.roro.springbootweb.servlet.MyServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
//@EnableWebMvc
//这个地方不要用@EnableWebMvc注解，相对的这个地方要继承WebMvcConfigurerAdapter
//@EnableWebMvc注解会启动springboot的默认配置
//这个地方主要演示如何自定义整合拦截器、过滤器、servlet等等
public class MyConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private MyInterceptor myInterceptor;

    /**注册拦截器 */
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/index.html","/");
    }

    /**注册一个filter 过滤器*/
    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

    @Bean
    public ServletRegistrationBean myServlet() {
        ServletRegistrationBean servletRegistrationBean =
                new ServletRegistrationBean(new MyServlet(),"/test123");
        return servletRegistrationBean;
    }

    /**请求试图映射*/
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login.html");
    }

}
