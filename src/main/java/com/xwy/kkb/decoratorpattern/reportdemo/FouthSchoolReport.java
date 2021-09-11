package com.xwy.kkb.decoratorpattern.reportdemo;

/**
 * @Classname FouthSchoolReport
 * @Created by 寂然
 * @Description 四年级的成绩单实现类
 *
 */
public class FouthSchoolReport extends SchoolReport{


    //给老爸看成绩单
    @Override
    public void report() {

        System.out.println("老爸，给你看成绩单");

        System.out.println("尊敬的XX家长，成绩如下");

        System.out.println("语文，56，数学，57.英语 61");

        System.out.println("家长签名：");

    }

    @Override
    public void sign() {

        System.out.println("家长签名为：XXX");
    }
}
