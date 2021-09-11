package com.xwy.kkb.decoratorpattern.reportdemo;

/**
 * @Classname Father
 * @Created by 寂然
 * @Description 父亲类
 */
public class Father {

    public static void main(String[] args) {

        //成绩单要给老爸交上去
        FouthSchoolReport fouthSchoolReport = new SugarFouthSchoolReport();

        fouthSchoolReport.report();

        //签名
        //? 不直接把成绩单给老爸，我们装饰一下，包装一下
        //第一个，语文最高分65，
        //我们可以给老爸看下排名，
        fouthSchoolReport.sign();

    }
}
