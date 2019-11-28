package com.herp.pattern.proxy.staticproxy;

public class FangGeProxy implements Seller{
    private FangGe fangGe;

    public FangGeProxy(FangGe fangGe){
        this.fangGe = fangGe;
    }
    public void sell() {
        findBuyer();
        fangGe.sell();
        afterSell();
    }

    public void findBuyer(){
        System.out.println("代理帮助寻找买主");
    }

    public void afterSell(){
        System.out.println("达成交易后，办理相关手续");
    }
}
