package com.herp.pattern.factory.absfactory;

public class GeliFridge implements IFridge {
    @Override
    public void coldStorage() {
        System.out.println("格力冰箱");
    }
}
