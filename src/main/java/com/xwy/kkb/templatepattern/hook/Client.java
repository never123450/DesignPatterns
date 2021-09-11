package com.xwy.kkb.templatepattern.hook;

/**
 * @Classname Client
 * @Created by 寂然
 * @Description 客户端
 */
public class Client {

    public static void main(String[] args) {

        //制作黑豆豆浆
//        SoyaMilk blackBeanSoyaMilk = new BlackBeanSoyaMilk();
//
//        blackBeanSoyaMilk.make();

        //制作花生豆浆
//        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
//
//        peanutSoyaMilk.make();

        //制作纯豆浆
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();

        pureSoyaMilk.make();

    }
}
