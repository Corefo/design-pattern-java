package com.herp.pattern.proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SellerInvocationHandler implements InvocationHandler {

    // 要代理的真实对象
    private Object target;

    /**
     * 使用Proxy类静态方法获取代理类实例
     */
    public Object getProxyInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("执行方法前");
    }

    private void after() {
        System.out.println("执行方法后");
    }
}
