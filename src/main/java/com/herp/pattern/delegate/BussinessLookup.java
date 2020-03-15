package com.herp.pattern.delegate;

/**
 * 业务查找类，负责找到合适的业务
 */
public class BussinessLookup {
    private OrderService orderService;

    private LoginService loginService;

    /**
     * 查找对应的服务
     * @param serverType
     * @return
     */
    public BusinessService getBusinessService(ServerType serverType){
        if(serverType.equals(ServerType.LOGIN)){
            return loginService;
        }else{
            return orderService;
        }
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }
}
