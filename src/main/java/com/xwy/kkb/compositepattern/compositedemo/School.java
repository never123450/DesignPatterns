package com.xwy.kkb.compositepattern.compositedemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 非叶子节点 Composite
 * @author xwy
 * @date 11/9/2021 上午10:00
 * @param
 * @return
 */
public class School extends Component{

    public School(String name, String desc) {
        super(name, desc);
    }

    //直接组合Component
    List<Component> list = new ArrayList<>();


    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    //展示方法，就要展示出来当前学校下的所有学院
    @Override
    public void show() {

        System.out.println("====" + getName() + "===");

        //遍历集合
        for (Component component : list) {
            component.show();
        }
    }
}
