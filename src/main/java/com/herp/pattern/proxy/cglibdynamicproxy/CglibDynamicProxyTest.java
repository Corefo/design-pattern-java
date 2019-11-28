package com.herp.pattern.proxy.cglibdynamicproxy;


import com.herp.pattern.proxy.jdkdynamicproxy.IUser;
import com.herp.pattern.proxy.jdkdynamicproxy.UserImpl;

import java.util.concurrent.Callable;

public class CglibDynamicProxyTest {
    public static void main(String[] args) {
/*        MyCglibInterceptor myCglibInterceptor = new MyCglibInterceptor();
        IUser userCglibProxy = (IUser) myCglibInterceptor.getCglibProxyInstance(new UserImpl());
        userCglibProxy.sayHello();
        userCglibProxy.work();*/

        // 代理未实现任何接口的类
        MyCglibInterceptor myCglibInterceptor = new MyCglibInterceptor();
        HelloWorld helloWorldProxy = (HelloWorld) myCglibInterceptor.getCglibProxyInstance(new HelloWorld());
        helloWorldProxy.hello();
    }
}
