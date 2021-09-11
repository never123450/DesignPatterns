package com.xwy.proxy.custom;


import com.xwy.proxy.jdk.XieMu;
import com.xwy.proxy.staticed.Person;

/**
 * @author xwy
 * @date 2021/3/14
 * @param
 * @return
 */
public class CustomPorxyTest {

    public static void main(String[] args) {

        try {
            Person obj = (Person)new CustomMeipo().getInstance(new XieMu());
            System.out.println(obj.getClass());
            obj.findLove();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
