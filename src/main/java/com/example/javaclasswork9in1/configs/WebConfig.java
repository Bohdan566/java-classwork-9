package com.example.javaclasswork9in1.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String location =
                System.getProperty("user.home") + File.separator + ("Pictures2") + File.separator;
        registry.addResourceHandler("/pic/**")
                .addResourceLocations("file:" + location);
    }
}
