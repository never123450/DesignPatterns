package com.xwy.kkb.adapterpattern.objectadapter;

/**
 * @Classname AC
 * @Created by 寂然
 * @Description 被适配者
 */
public class AC {

    public int outputAC(){

        int srcV = 220;

        System.out.println(srcV + "V的交流电");

        return srcV;
    }
}
