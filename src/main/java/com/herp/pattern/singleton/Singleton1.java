package com.herp.pattern.singleton;

/**
 *  饿汉单例，线程安全
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();
    private Singleton1 (){}
    public static Singleton1 getInstance() {
        return instance;
    }
}
