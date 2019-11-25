package com.herp.pattern.factory.absfactory;

public class AbsFactoryTest {
    public static void main(String[] args) {

        IHouseholdElectricFactory factory = new MeideHouseholdFactory();
        factory.createFridge().coldStorage();
        factory.createWasher().wash();
    }
}
