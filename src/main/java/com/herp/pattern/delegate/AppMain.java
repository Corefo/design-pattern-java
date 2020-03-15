package com.herp.pattern.delegate;

public class AppMain {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        BussinessLookup bussinessLookup = new BussinessLookup();
        bussinessLookup.setLoginService(new LoginService());
        bussinessLookup.setOrderService(new OrderService());

        businessDelegate.setBussinessLookup(bussinessLookup);
        businessDelegate.setServerType(ServerType.LOGIN);
        Client client = new Client(businessDelegate);
        client.doTask();

//        businessDelegate.setServerType(ServerType.ORDER);
//        client.doTask();
    }
}
