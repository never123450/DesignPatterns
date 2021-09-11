package com.xwy.kkb.compositepattern.hashmapdemo;

import java.util.HashMap;

/**
 * @Classname Test
 * @Created by 寂然
 * @Description 组合模式在HashMap源码中的应用
 */
public class Test {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("第一章","原理");

        HashMap<String, String> map = new HashMap<>();

        map.put("第一节","原理一");

        map.put("第二节","原理二");

        hashMap.putAll(map);
    }
}
