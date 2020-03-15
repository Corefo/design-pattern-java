package com.herp.pattern.factory.payexample;

public class WeChatPay implements IPay{
    public void pay() {
        System.out.println("微信支付");
    }
}
