package com.haizi.config;

import com.haizi.utils.LoginInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(
                "/shop/**",
                "/voucher/**",
                "/upload/**",
                "/shop-type/**",
                "/blog/hot",
                "/user/code",
                "/user/login"
        );


        }
    }

