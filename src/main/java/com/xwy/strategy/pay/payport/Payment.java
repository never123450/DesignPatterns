package com.xwy.strategy.pay.payport;


import com.xwy.strategy.pay.PayState;

/**
 * @author xwy
 * @date 2021/3/14
 * @param
 * @return
 */
public interface Payment {

    public PayState pay(String uid, double amount);

}
