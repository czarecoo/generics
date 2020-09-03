package com.czareg;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void talk() {
        System.out.println("woof");
    }
}
