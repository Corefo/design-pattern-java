package com.herp.pattern.singleton;

/**
 *  静态内部类实现单例，效率高，线程安全
 */
public class Singleton6 {
    private static class SingletonHolder {
        private static final Singleton6 INSTANCE = new Singleton6();
    }
    private Singleton6 (){}
    public static final Singleton6 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
