package com.xwy.kkb.templatepattern.templatedemo;

/**
 * @Classname SoyaMilk
 * @Created by 寂然
 * @Description 抽象类，表示豆浆
 */
public abstract class SoyaMilk {

    //make 即模板方法，可以做成final,不让子类去覆盖
    final void make(){

        select();
        add();
        soak();
        beat();

    }

    //选材
    void select(){
        System.out.println("选择新鲜的黄豆作为材料");
    }

    //添加配料，抽象方法
    abstract void add();

    //浸泡
    void soak(){
        System.out.println("将所有的材料浸泡一段时间");
    }

    //打碎
    void beat(){
        System.out.println("将所有的材料放到豆浆机里打碎进行制作");
    }

}
