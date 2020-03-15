package com.herp.pattern.factory.payexample;

public class PayPatternFactory {

    public IPay getPayPattern(String choice){
        IPay payPattern = null;
        if("ali".equals(choice)){
            payPattern = new AliPay();
        }else if("wechat".equals(choice)){
            payPattern = new WeChatPay();
        }
        else if("union".equals(choice)){
            payPattern = new UnionPay();
        }
        else{
            payPattern = new CrossBorderPay();
        }
        return  payPattern;
    }
}
