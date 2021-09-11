package com.xwy.kkb.visitorpattern.visitordemo;

/**
 * @Classname Fail
 * @Created by 寂然
 * @Description I walk very slowly, but I never walk backwards
 */
public class Fail extends Action {

    @Override
    public void getInnerResult(InnerAudience innerAudience) {
        System.out.println("场内观众认为该歌手淘汰");
    }

    @Override
    public void getOuterResult(OuterAudience man) {

        System.out.println("场外观众认为该歌手淘汰");
    }
}
