package com.herp.pattern.proxy.jdkdynamicproxy;

import com.herp.pattern.proxy.staticproxy.FangGe;
import com.herp.pattern.proxy.staticproxy.Seller;

public class JDKDynamicProxyTest {
    public static void main(String[] args) {

/*        // new一个房哥，下面帮房哥找个代理
        FangGe fangGe = new FangGe();
        SellerInvocationHandler sellerInvocationHandler = new SellerInvocationHandler();

        // 房哥的代理对象
        Seller seller = (Seller) sellerInvocationHandler.getProxyInstance(fangGe);
        seller.sell();*/

        // 代理user类
        IUser user = new UserImpl();
        SellerInvocationHandler sellerInvocationHandler = new SellerInvocationHandler();
        IUser userProxy = (IUser) sellerInvocationHandler.getProxyInstance(user);
        userProxy.sayHello();
        userProxy.work();

    }
}
