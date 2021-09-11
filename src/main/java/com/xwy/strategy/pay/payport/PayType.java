package com.xwy.strategy.pay.payport;

/**
 * @Description 姑且把这个枚举当做一个常量去维护 
 * @author xwy
 * @date 2021/3/14
 * @param  
 * @return 
 */
public enum PayType {
    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WechatPay()),
    UNION_PAY(new UnionPay()),
    JD_PAY(new JDPay());

    private Payment payment;
    PayType(Payment payment){
        this.payment = payment;
    }

    public Payment get(){ return  this.payment;}
}
