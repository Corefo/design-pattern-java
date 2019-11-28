package com.herp.pattern.proxy.jdkdynamicproxy;

public class UserImpl implements IUser{

    public void work() {
        System.out.println("我正在写代码");
    }

    public void sayHello() {
        System.out.println("hello,我是小明");
    }
}
