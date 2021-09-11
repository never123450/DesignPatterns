package com.xwy.kkb.decoratorpattern.reportdemo;

/**
 * @Classname SchoolReport
 * @Created by 寂然
 * @Description 成绩单 - 抽象类
 */
public abstract class SchoolReport {

    //成绩单的内容
    public abstract void report();

    //签名栏，找家长签字
    public abstract void sign();
}
