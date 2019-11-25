package com.herp.pattern.factory.simplefactory;

import com.herp.pattern.factory.BiluochunTea;
import com.herp.pattern.factory.ITea;
import com.herp.pattern.factory.LongjingTea;

public class TeaFactory {

    public ITea createTea(String type){
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
    }
}
