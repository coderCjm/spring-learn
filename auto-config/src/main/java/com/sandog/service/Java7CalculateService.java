package com.sandog.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by sandog on 2018/12/18.
 */
@Service
@Profile("java7")
public class Java7CalculateService implements CalculateService {

    @Override
    public int sum(Integer... values) {
        System.out.println("java 7 实现");
        int sum = 0;
        for (Integer a : values) {
            sum += a;
        }
        return sum;
    }
}
