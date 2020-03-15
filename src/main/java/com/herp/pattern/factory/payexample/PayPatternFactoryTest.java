package com.herp.pattern.factory.payexample;

public class PayPatternFactoryTest {
    public static void main(String[] args) {
        PayPatternFactory factory = new PayPatternFactory();
        String choice = "ali";
        IPay payPattern = factory.getPayPattern(choice);
        payPattern.pay();
    }
}
