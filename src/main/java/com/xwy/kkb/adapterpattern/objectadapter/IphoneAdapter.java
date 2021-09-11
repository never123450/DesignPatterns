package com.xwy.kkb.adapterpattern.objectadapter;

/**
 * @Classname IphoneAdapter
 * @Created by 寂然
 * @Description 适配器
 */
public class IphoneAdapter implements DC{


    //改为持有被适配者的对象
    private AC ac;

    public IphoneAdapter(AC ac) {
        this.ac = ac;
    }

    @Override
    public int outputDC() {

        //获取到220V交流电
        int srcV = this.ac.outputAC();

        //模拟适配器的转化过程，去转化为5V的直流电
        int targetV = srcV/44;

        return targetV;
    }
}
