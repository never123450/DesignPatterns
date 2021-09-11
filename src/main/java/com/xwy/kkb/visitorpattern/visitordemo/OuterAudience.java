package com.xwy.kkb.visitorpattern.visitordemo;

/**
 * @Classname OuterAudience
 * @Created by 寂然
 * @Description I walk very slowly, but I never walk backwards
 */
public class OuterAudience extends Audience {

    @Override
    public void accept(Action action) {
        action.getOuterResult(this);
    }
}
