package com.sandog.annotation;

import java.lang.annotation.*;

/**
 * Created by sandog on 2018/12/18.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirshLevelRepository
public @interface SecondLevelRepository {

    String value() default "";

}
