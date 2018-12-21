package com.sandog.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * Created by sandog on 2018/12/18.
 */
@Service
@Profile("java8")
public class Java8CalculateService implements CalculateService {

    @Override
    public int sum(Integer... values) {
        System.out.println("java 8 实现");
        return Stream.of(values).reduce(0, Integer :: sum);
    }
}
