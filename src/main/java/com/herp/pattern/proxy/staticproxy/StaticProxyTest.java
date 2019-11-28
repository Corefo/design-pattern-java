package com.herp.pattern.proxy.staticproxy;

public class StaticProxyTest {
    public static void main(String[] args) {
        Seller seller = new FangGeProxy(new FangGe());
        seller.sell();
    }
}
