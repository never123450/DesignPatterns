package com.xwy.kkb.templatepattern.hook;

/**
 * @Classname PureSoyaMilk
 * @Created by 寂然
 * @Description 纯豆浆
 */
public class PureSoyaMilk extends SoyaMilk {

    @Override
    void add() {
        //空实现
        //TODO...
    }

    @Override
    boolean needBatching() {
        return false; //不会再去加配料
    }
}
