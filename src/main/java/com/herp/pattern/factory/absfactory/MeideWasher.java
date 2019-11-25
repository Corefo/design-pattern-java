package com.herp.pattern.factory.absfactory;

public class MeideWasher implements IWasher {
    @Override
    public void wash() {
        System.out.println("美的洗衣机");
    }
}
