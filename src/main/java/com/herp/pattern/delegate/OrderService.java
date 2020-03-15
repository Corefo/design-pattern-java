package com.herp.pattern.delegate;

public class OrderService implements BusinessService{
    public void doService() {
        System.out.println("订单业务模块");
    }
}
