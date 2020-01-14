package com.herp.pattern.singleton;

/**
 *  懒汉单例，线程安全
 */
public class Singleton4 {
    private static Singleton4 singleton;
    private Singleton4() {}
    public static synchronized Singleton4 getInstance() {
        if (singleton == null) {
            singleton = new Singleton4();
        }
        return singleton;
    }
}
