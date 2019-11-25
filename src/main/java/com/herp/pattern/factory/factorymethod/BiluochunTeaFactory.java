package com.herp.pattern.factory.factorymethod;

import com.herp.pattern.factory.BiluochunTea;
import com.herp.pattern.factory.ITea;

public class BiluochunTeaFactory implements ITeaFactory{
    @Override
    public ITea createTea() {
        return new BiluochunTea();
    }
}
