package com.herp.pattern.factory;

import com.herp.pattern.factory.ITea;

public class BiluochunTea implements ITea {
    @Override
    public void makeTea() {
        System.out.println("碧螺春");
    }
}
