package com.xwy.kkb.proxypattern.jdkdynamicproxy;

/**
 * @Classname TargetTeacher
 * @Created by 寂然
 * @Description 目标讲师
 */
public class TargetTeacher implements ITeacher {


    @Override
    public void teach() {

        System.out.println("目标讲师正在授课中...");
    }
}
