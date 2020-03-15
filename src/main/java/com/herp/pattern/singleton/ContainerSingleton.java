package com.herp.pattern.singleton;

import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton {

    private ContainerSingleton(){}

    private static  Map<String,Object> map = new HashMap<String, Object>();

    public synchronized static Object getInstance(String className){
        Object instance = null;
        if(map.containsKey(className)){
            try {
                instance = Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return instance;
        }else{
            return map.get(className);
        }

    }
}
