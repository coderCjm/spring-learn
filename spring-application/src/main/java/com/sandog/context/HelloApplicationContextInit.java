package com.sandog.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * Created by sandog on 2018/12/20.
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloApplicationContextInit implements ApplicationContextInitializer{

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("init first," + configurableApplicationContext.getId());
    }

}
