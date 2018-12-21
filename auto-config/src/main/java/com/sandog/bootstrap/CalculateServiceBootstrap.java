package com.sandog.bootstrap;

import com.sandog.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by sandog on 2018/12/18.
 */
@SpringBootApplication(scanBasePackages = "com.sandog.service")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("java7")
                .run(args);
        CalculateService service = context.getBean(CalculateService.class);
        System.out.println(service.sum(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        context.close();
    }

}