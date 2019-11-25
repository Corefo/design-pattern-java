package com.herp.pattern.factory.absfactory;

public class MeideFridge implements IFridge{
    @Override
    public void coldStorage() {
        System.out.println("美的冰箱");
    }
}
