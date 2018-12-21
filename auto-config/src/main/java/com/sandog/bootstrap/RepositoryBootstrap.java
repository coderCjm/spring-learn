package com.sandog.bootstrap;

import com.sandog.repository.MyFirstRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by sandog on 2018/12/18.
 */
@ComponentScan(basePackages = "com.sandog.repository")
public class RepositoryBootstrap {

    public static void main (String [] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE).run(args);
        MyFirstRepository repository = context.getBean("firstRepository", MyFirstRepository.class);
        System.out.println(repository.getId());
        context.close();
    }

}
