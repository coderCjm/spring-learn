package com.sandog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sandog on 2018/12/19.
 */
@SpringBootApplication
public class SpringApplicationBootStrap {

    public static void main(String [] args) {
        Set<String> set = new HashSet<>();
        set.add(SpringApplicationBootStrap.class.getName());
        SpringApplication application = new SpringApplication();
        application.setSources(set);
        application.run(args);
    }

}
