package com.shaw.mydaily.entity;

import org.springframework.stereotype.Component;

@Component
public class Tiger {

    private String name;

    public Tiger() {
    }

    public void eat(){
        System.out.println("eat meat");
    }
}
