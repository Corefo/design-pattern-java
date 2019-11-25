package com.herp.pattern.prototype;

public class Dog extends Animal{

    public Dog(String name, float weight){
        this.name = name;
        this.weight = weight;
    }
    @Override
    void bark() {
        System.out.println("狗叫。。。。。");
    }
}
