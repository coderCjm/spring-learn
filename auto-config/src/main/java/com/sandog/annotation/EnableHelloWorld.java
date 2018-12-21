package com.sandog.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by sandog on 2018/12/18.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}
