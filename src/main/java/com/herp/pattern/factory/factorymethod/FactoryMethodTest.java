package com.herp.pattern.factory.factorymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ITeaFactory factory = new LongjingTeaFactory();
        factory.createTea();

        factory = new BiluochunTeaFactory();
        factory.createTea();
    }
}
