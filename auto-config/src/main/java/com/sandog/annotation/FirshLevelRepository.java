package com.sandog.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * Created by sandog on 2018/12/18.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirshLevelRepository {

    String value() default "";

}
