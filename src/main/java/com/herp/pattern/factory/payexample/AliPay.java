package com.herp.pattern.factory.payexample;

public class AliPay implements IPay{
    public void pay() {
        System.out.println("支付宝支付");
    }
}
