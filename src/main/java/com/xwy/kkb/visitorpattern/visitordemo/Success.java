package com.xwy.kkb.visitorpattern.visitordemo;

/**
 * @Classname Success
 * @Created by 寂然
 * @Description I walk very slowly, but I never walk backwards
 */
public class Success extends Action {

    @Override
    public void getInnerResult(InnerAudience innerAudience) {
        System.out.println("场内观众给的评价是该歌手晋级");
    }

    @Override
    public void getOuterResult(OuterAudience man) {

        System.out.println("场外观众给的评价是该歌手晋级");
    }
}
