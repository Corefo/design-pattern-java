package com.herp.pattern.prototype;

import java.util.Hashtable;

public class AnimalCache {
    private static Hashtable<String, Animal> animalMap
            = new Hashtable<String, Animal>();

    public static Animal getAnimal(String name) {
        Animal cachedAnimal = animalMap.get(name);
        return (Animal) cachedAnimal.clone();
    }

    public static void loadCache() {
        Cat cat = new Cat("tom",50);
        animalMap.put("cat",cat);

        Dog dog = new Dog("小六",100);
        animalMap.put("dog",dog);

    }
}
