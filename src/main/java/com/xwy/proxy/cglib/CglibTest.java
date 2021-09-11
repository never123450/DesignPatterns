package com.xwy.proxy.cglib;

/**
 * @author xwy
 * @date 2021/3/14
 * @param
 * @return
 */
public class CglibTest {

    public static void main(String[] args) {

        try {
            ZhangSan obj = (ZhangSan)new CglibMeipo().getInstance(ZhangSan.class);
            obj.findLove();
            System.out.println("--------------------------------");
           // System.out.println(obj.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
