package com.herp.pattern.factory.simplefactory;

import com.herp.pattern.factory.ITea;

public class SimpleFactoryTest {

    /**
     *  准备沏一杯茶，根据传入的参数决定不同的茶叶类型
     */
/*    public ITea prepareTea(String type){
        ITea tea = null;
        if(type.equals("longjing")){
            tea = new LongjingTea();
        }else if(type.equals("biluochun")){
            tea = new BiluochunTea();
        }
        if(tea != null){
            tea.makeTea();
        }
        return tea;
    }*/
    public static void main(String[] args) {

        TeaFactory teaFactory = new TeaFactory();
        ITea tea = teaFactory.createTea("longjing");
    }
}
