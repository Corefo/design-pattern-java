package com.herp.pattern.factory.payexample;

public class CrossBorderPay implements IPay{
    public void pay() {
        System.out.println("跨境支付");
    }
}
