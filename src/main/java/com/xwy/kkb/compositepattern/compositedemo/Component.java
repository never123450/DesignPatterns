package com.xwy.kkb.compositepattern.compositedemo;

/**
 * @Description 组合模式的抽象构建
 * 这是组合模式中的抽象构建，它里面定义了所有类共有的默行文，用来访问和管理Component的子部件，
 * Component可以是抽象类，也可以是接口
 *
 * leaf：在组合模式中表示叶子节点，叶子结点没有子节点了，他是最末端存放数据的结构
 * Composite：非叶子节点，下面有分支，用来存储分支，实现了 Component 定义的默认行为
 * @author xwy
 * @date 11/9/2021 上午9:11
 * @param
 * @return
 */
public abstract class Component {

    private String name; //名称

    private String desc; //基本介绍

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Component(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public void add(Component component){
        //业务逻辑无法确定，给个默认实现
        throw new UnsupportedOperationException();
    }

    public void remove(Component component){
        throw new UnsupportedOperationException();
    }

    //展示方法
    //可以做成抽象方法了
    public abstract void show();

}
