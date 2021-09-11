package com.xwy.kkb.visitorpattern.visitordemo;

/**
 * @Classname Audience
 * @Created by 寂然
 * @Description 观众
 */
public abstract class Audience {

    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);

}
