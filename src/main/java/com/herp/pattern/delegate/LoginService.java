package com.herp.pattern.delegate;

public class LoginService implements BusinessService{
    public void doService() {
        System.out.println("处理登录相关业务");
    }
}
