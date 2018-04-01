package com.shaw.mydaily.entity;

import org.springframework.stereotype.Component;

@Component
public class Animal {

    private Dog dog;

    public Animal(Dog dog) {
        this.dog = dog;
    }

    public void eat(){
        dog.eat();
    }
}
