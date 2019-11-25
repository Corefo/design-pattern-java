package com.herp.pattern.factory.absfactory;

public class GeliHouseholdFactory implements IHouseholdElectricFactory{
    @Override
    public IFridge createFridge() {
        return new GeliFridge();
    }

    @Override
    public IWasher createWasher() {
        return new GeliWasher();
    }
}
