package com.sandog.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by sandog on 2018/12/18.
 */
@EnableAutoConfiguration
public class EnableAutoConfigBootStrap {

    public static void main (String [] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableAutoConfigBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloworld = context.getBean("helloWorld", String.class);
        System.out.println(helloworld);
        context.close();
    }

}
