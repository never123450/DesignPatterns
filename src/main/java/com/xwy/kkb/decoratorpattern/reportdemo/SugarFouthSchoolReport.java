package com.xwy.kkb.decoratorpattern.reportdemo;

/**
 * @Classname SugarFouthSchoolReport
 * @Created by 寂然
 * @Description 美化后的四年级成绩单
 */
public class SugarFouthSchoolReport extends FouthSchoolReport{

    //说最高分来铺垫
    public void reportHighScore(){

        System.out.println("老爸你可能有所不知，最高分语文才65，数学才67.。。");
    }

    //说一下排名，麻痹一下老爸
    public void reportSort(){

        System.out.println("老爸，还有一个事，我这次排30多名，不在倒数前十了");
    }

    @Override
    public void report() {

        reportHighScore();

        reportSort();

        super.report();
    }
}
