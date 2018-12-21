package com.sandog.bootstrap;

import com.sandog.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by sandog on 2018/12/18.
 */
@EnableHelloWorld
public class HelloWorldBootstrap {

    public static void main (String [] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(HelloWorldBootstrap.class)
                .web(WebApplicationType.NONE).run(args);
        String helloworld = context.getBean("helloWorld", String.class);
        System.out.println(helloworld);
        context.close();
    }

}
