package com.sandog.repository;

import com.sandog.annotation.FirshLevelRepository;

/**
 * Created by sandog on 2018/12/18.
 */
@FirshLevelRepository(value = "firstRepository")
public class MyFirstRepository {

    private int id = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
