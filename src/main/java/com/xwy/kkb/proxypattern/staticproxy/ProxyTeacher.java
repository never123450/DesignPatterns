package com.xwy.kkb.proxypattern.staticproxy;

/**
 * @Description 代理讲师 - 代理模式的代理类
 * @author xwy
 * @date 14/9/2021 下午3:52
 * @param
 * @return
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
