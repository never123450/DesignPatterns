package com.xwy.strategy.pay.payport;


import com.xwy.strategy.pay.PayState;

/**
 * @Description  
 * @author xwy
 * @date 2021/3/14
 * @param  
 * @return 
 */
public class WechatPay implements Payment {

    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用微信支付");
        System.out.println("直接从微信红包扣款");
        return new PayState(200,"支付成功",amount);
    }
}
