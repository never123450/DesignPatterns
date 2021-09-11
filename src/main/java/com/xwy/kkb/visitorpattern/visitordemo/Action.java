package com.xwy.kkb.visitorpattern.visitordemo;

/**
 * @Classname Action
 * @Created by 寂然
 * @Description I walk very slowly, but I never walk backwards
 */
public abstract class Action {

    //得到场内观众的测评结果
    public abstract void getInnerResult(InnerAudience innerAudience);

    //得到场外观众的测评结果
    public abstract void getOuterResult(OuterAudience man);
}
