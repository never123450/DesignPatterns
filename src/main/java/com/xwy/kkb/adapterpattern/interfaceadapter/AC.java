package com.xwy.kkb.adapterpattern.interfaceadapter;

/**
 * @Classname AC
 * @Created by 寂然
 * @Description 被适配者的角色 220V
 */
public class AC {

    public int outputAC(){

        int srcV = 220;

        System.out.println(srcV + "V交流电");

        return srcV;
    }
}
