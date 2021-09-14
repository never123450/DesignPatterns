package com.xwy.kkb.proxypattern.staticproxy;

/**
 * @Description 目标讲师 - 代理模式目标类
 * @author xwy
 * @date 14/9/2021 下午3:52
 * @param
 * @return
 */
public class TargetTeacher implements ITeacher{

    @Override
    public void teach() {
        System.out.println("目标讲师正在授课中....");
    }
}
