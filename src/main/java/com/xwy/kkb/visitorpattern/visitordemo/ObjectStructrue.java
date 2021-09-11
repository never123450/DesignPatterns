package com.xwy.kkb.visitorpattern.visitordemo;

import java.util.LinkedList;
import java.util.List;

/**
 * @Classname ObjectStructrue
 * @Created by 寂然
 * @Description 数据结构，管理很多观众
 */
public class ObjectStructrue {

    //维护了一个集合
    private List<Audience> audiences = new LinkedList<>();

    //增加到List
    public void attach(Audience audience){

        audiences.add(audience);
    }

    //从list里移除
    public void detach(Audience audience){

        audiences.remove(audience);
    }

    //显示测评情况
    public void display(Action action){

        for (Audience audience : audiences) {
             audience.accept(action);
        }
    }

}
