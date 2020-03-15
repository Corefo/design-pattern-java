package com.herp.pattern.singleton;

public class ThreadLocalSingleton {

    private ThreadLocalSingleton(){}

    private static ThreadLocal<ThreadLocalSingleton> localMap = new ThreadLocal<ThreadLocalSingleton>(){

        @Override
        protected ThreadLocalSingleton initialValue(){
            return new ThreadLocalSingleton();
        }

    };

    public static ThreadLocalSingleton getInstance(){
        return localMap.get();
    }
}
