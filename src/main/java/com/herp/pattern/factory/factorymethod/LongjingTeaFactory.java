package com.herp.pattern.factory.factorymethod;

import com.herp.pattern.factory.ITea;
import com.herp.pattern.factory.LongjingTea;

public class LongjingTeaFactory implements ITeaFactory{
    @Override
    public ITea createTea() {
        return new LongjingTea();
    }
}
