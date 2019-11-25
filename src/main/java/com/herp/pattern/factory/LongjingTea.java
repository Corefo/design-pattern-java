package com.herp.pattern.factory;

import com.herp.pattern.factory.ITea;

public class LongjingTea implements ITea {
    @Override
    public void makeTea() {
        System.out.println("西湖龙井");
    }
}
