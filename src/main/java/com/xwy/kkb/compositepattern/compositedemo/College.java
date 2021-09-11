package com.xwy.kkb.compositepattern.compositedemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description  学院，也是非叶子节点
 * @author xwy
 * @date 11/9/2021 上午9:19
 * @param
 * @return
 */
public class College extends Component{

    public College(String name, String desc) {
        super(name, desc);
    }

    //组合专业
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

    //展示该学院下的所有专业
    @Override
    public void show() {

        System.out.println("===" + getName() + "====");

        for (Component component : list) {

            component.show();
        }

    }
}
