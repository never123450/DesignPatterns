package com.xwy.kkb.adapterpattern.classadapter;

/**
 * @Classname AC
 * @Created by 寂然
 * @Description 220V交流电 扮演的是被适配者的角色
 */
public class AC {

    //输出交流电
    public int outputAC(){

        int srcV = 220;

        System.out.println(srcV + "V交流电");

        return srcV;

    }
}
