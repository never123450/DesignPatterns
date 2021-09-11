package com.xwy.kkb.compositepattern.compositedemo;

/**
 * @Description 在当前业务逻辑下，是叶子节点
 * @author xwy
 * @date 11/9/2021 上午10:04
 * @param
 * @return
 */
public class Major extends Component{

    public Major(String name, String desc) {
        super(name, desc);
    }

    //无须重写


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public void show() {
        //直接打印出当前专业名字就可以
        System.out.println(getName());
    }
}
