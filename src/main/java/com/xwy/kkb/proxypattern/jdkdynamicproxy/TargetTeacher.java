package com.xwy.kkb.proxypattern.jdkdynamicproxy;

/**
 * @Description 目标讲师
 * @author xwy
 * @date 14/9/2021 下午4:23
 * @param
 * @return
 */
public class TargetTeacher implements ITeacher {

    @Override
    public void teach() {
        System.out.println("目标讲师正在授课中...");
    }
}
