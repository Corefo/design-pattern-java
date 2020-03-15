package com.herp.pattern.factory.payexample;

public class UnionPay implements IPay{
    public void pay() {
        System.out.println("银联支付");
    }
}
