package com.herp.pattern.factory.absfactory;

public class GeliWasher implements IWasher{
    @Override
    public void wash() {
        System.out.println("格力洗衣机");
    }
}
