package com.springboot.hibernate.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {
@Bean
ServletRegistrationBean h2dbservletRegistration(){
    ServletRegistrationBean h2dhServletBean = new ServletRegistrationBean( new WebServlet());
    h2dhServletBean.addUrlMappings("/console/*");
    return h2dhServletBean;
}
}