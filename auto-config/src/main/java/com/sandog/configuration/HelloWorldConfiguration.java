package com.sandog.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sandog on 2018/12/18.
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "hello   333 world";
    }

}
