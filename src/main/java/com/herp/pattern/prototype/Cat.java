package com.herp.pattern.prototype;

public class Cat extends Animal{

    public Cat(String name, float weight){
        this.name = name;
        this.weight = weight;
    }
    @Override
    void bark() {
        System.out.println("猫叫。。。。。");
    }
}
