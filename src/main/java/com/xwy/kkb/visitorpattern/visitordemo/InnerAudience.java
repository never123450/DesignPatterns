package com.xwy.kkb.visitorpattern.visitordemo;

/**
 * @Classname InnerAudience
 * @Created by 寂然
 * @Description I walk very slowly, but I never walk backwards
 */
public class InnerAudience extends Audience {

    //这里我们使用到了双分派，即首先在客户端程序中，将具体状态作为参数传递到Man中
    //然后Woman类调用作为参数的“具体方法”中方法getManResult，同时将自己（this）作为
    //参数传入，完成第二次的分派
    @Override
    public void accept(Action action) {

        action.getInnerResult(this);

    }
}
