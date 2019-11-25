package com.herp.pattern.factory.absfactory;

public class MeideHouseholdFactory implements IHouseholdElectricFactory{
    @Override
    public IFridge createFridge() {
        return new MeideFridge();
    }

    @Override
    public IWasher createWasher() {
        return new MeideWasher();
    }
}
