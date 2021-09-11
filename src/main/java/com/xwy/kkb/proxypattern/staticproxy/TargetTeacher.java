package com.xwy.kkb.proxypattern.staticproxy;

/**
 * @Classname TargetTeacher
 * @Created by 寂然
 * @Description 目标讲师 - 代理模式目标类
 */
public class TargetTeacher implements ITeacher{


    @Override
    public void teach() {
        System.out.println("目标讲师正在授课中....");
    }
}
