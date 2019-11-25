package com.herp.pattern.factory.absfactory;

/**
 * 抽象工厂接口，家用电器工厂，生产冰箱和洗衣机
 */
public interface IHouseholdElectricFactory {

    IFridge createFridge();

    IWasher createWasher();
}
