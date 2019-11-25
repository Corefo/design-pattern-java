package com.herp.pattern.factory.factorymethod;

import com.herp.pattern.factory.ITea;

/**
 * 生产茶叶的统一接口
 */
public interface ITeaFactory {

    // 生产茶叶
    public ITea createTea();
}
