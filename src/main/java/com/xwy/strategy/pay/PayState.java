package com.xwy.strategy.pay;

/**
 * @author xwy
 * @date 2021/3/14
 * @param
 * @return
 * @Description 支付完成以后的状态
 */
public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code, String msg,Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public String toString(){
        return ("支付状态：[" + code + "]," + msg + ",交易详情：" + data);
    }
}
