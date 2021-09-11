package com.xwy.kkb.proxypattern.staticproxy;

/**
 * @Classname ProxyTeacher
 * @Created by 寂然
 * @Description 代理讲师 - 代理模式的代理类
 */
public class ProxyTeacher implements ITeacher{

    private ITeacher teacher;

    public ProxyTeacher(ITeacher teacher) {
        this.teacher = teacher;
    }


    @Override
    public void teach() {
        //在目标对象的前后添加业务逻辑
        System.out.println("代理老师进来打开了视频会议功能，招呼老师可以上课了");

        teacher.teach();

        System.out.println("代理老师关闭了视频会议功能，招呼同学可以下课了");
    }
}
