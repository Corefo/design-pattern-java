package com.herp.pattern.singleton;

/**
 *  饿汉单例，线程安全，静态代码块的方式
 */
public class Singleton2 {
    private static Singleton2 instance;
    static {
        instance = new Singleton2();
    }
    private Singleton2() {}
    public static Singleton2 getInstance() {
        return instance;
    }
}