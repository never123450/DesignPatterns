package com.xwy.kkb.visitorpattern.visitordemo;

/**
 * @Classname Client
 * @Created by 寂然
 * @Description I walk very slowly, but I never walk backwards
 */
public class Client {

    public static void main(String[] args) {

        ObjectStructrue objectStructrue = new ObjectStructrue();

        objectStructrue.attach(new InnerAudience());
        objectStructrue.attach(new OuterAudience());
        objectStructrue.attach(new InnerAudience());

        //晋级
        Success success = new Success();
        objectStructrue.display(success);

        //失败
        Fail fail = new Fail();
        objectStructrue.display(fail);

        //待定
        Wait wait = new Wait();
        objectStructrue.display(wait);
    }
}
