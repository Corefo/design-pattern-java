package com.herp.pattern.prototype;

public class PrototypePatternTest {
    public static void main(String[] args) {
        AnimalCache.loadCache();
        Animal dog1 = AnimalCache.getAnimal("dog");
        Animal dog2 = AnimalCache.getAnimal("dog");
        System.out.println(dog1);
        System.out.println(dog2);
        dog2.bark();
        Animal cat2 = AnimalCache.getAnimal("cat");
        cat2.bark();
    }
}
