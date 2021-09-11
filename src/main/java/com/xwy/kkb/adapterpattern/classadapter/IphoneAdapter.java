package com.xwy.kkb.adapterpattern.classadapter;

/**
 * @Classname IphoneAdapter
 * @Created by 寂然
 * @Description 手机充电器，扮演适配器的角色
 */
public class IphoneAdapter extends AC implements DC {


    @Override
    public int outputDC() {

        //获取220v交流电

        int srcV = outputAC();

        //模拟适配器转换过程，转化为5V直流电
        int targerV = srcV/44;

        return targerV;
    }
}
