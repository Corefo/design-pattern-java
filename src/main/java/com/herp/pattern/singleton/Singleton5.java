package com.herp.pattern.singleton;

/**
 *  双重锁校验，效率高，线程安全
 */
public class Singleton5 {
    private volatile static Singleton5 singleton;
    private Singleton5() {}
    public static Singleton5 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton5.class) {
                if (singleton == null) {
                    singleton = new Singleton5();
                }
            }
        }
        return singleton;
    }
}
