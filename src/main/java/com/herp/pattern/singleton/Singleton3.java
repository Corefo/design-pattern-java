package com.herp.pattern.singleton;

/**
 *  懒汉单例，线程不安全
 */
public class Singleton3 {
    private static Singleton3 singleton;
    private Singleton3() {}
    public static Singleton3 getInstance() {
        if (singleton == null) {
            singleton = new Singleton3();
        }
        return singleton;
    }
}
