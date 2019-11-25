package com.herp.pattern.prototype;

public abstract class Animal implements Cloneable{

    // 名字
    protected String name;

    // 重量
    protected float weight;

    // 叫声，定义为抽象的
    abstract void bark();

    // 克隆，此处直接使用object的clone来进行对象拷贝
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
