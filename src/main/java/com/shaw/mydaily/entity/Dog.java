package com.shaw.mydaily.entity;

import org.springframework.stereotype.Component;

@Component
public class Dog {

    private String name;

    public Dog() {
    }

    public void eat(){
        System.out.println("eat meat");
    }
}
