package com.xwy.kkb.adapterpattern.interfaceadapter;

/**
 * @Classname DefaultAdapter
 * @Created by 寂然
 * @Description 中间的抽象类
 */
public class DefaultAdapter implements DC{

    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output12V() {
        return 0;
    }

    @Override
    public int output20V() {
        return 0;
    }
}
