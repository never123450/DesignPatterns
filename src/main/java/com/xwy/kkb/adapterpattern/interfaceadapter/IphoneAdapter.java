package com.xwy.kkb.adapterpattern.interfaceadapter;

/**
 * @Classname IphoneAdapter
 * @Created by 寂然
 * @Description 手机充电器只需要实现5v的充电方法即可
 */
public class IphoneAdapter extends DefaultAdapter{


    private AC ac;

    public IphoneAdapter(AC ac) {
        this.ac = ac;
    }

    //选择性的进行重写就OK
    @Override
    public int output5V() {

        //拿到220V交流电
        int outputAC = this.ac.outputAC();

        int targetV = outputAC/44;//假装模拟适配器的转化过程

        return targetV;
    }
}
