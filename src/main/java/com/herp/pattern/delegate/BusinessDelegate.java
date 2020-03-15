package com.herp.pattern.delegate;

/**
 * 委派类，用作业务分配。
 */
public class BusinessDelegate {
    private BussinessLookup bussinessLookup;

    private BusinessService businessService;

    private ServerType serverType;

    public void setBussinessLookup(BussinessLookup bussinessLookup) {
        this.bussinessLookup = bussinessLookup;
    }

    public void setServerType(ServerType serverType) {
        this.serverType = serverType;
    }

    /**
     * 委派方法，其实最终调用的是业务类的方法
     */
    public void doTask(){
        businessService = bussinessLookup.getBusinessService(serverType);
        businessService.doService();
    }
}
