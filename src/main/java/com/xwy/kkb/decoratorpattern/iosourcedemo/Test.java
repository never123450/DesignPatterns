package com.xwy.kkb.decoratorpattern.iosourcedemo;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * @Classname Test
 * @Created by 寂然
 * @Description I walk very slowly, but I never walk backwards
 */
public class Test {

    public static void main(String[] args) throws Exception{

        DataInputStream dis = new DataInputStream(new FileInputStream("d:\\jiran.txt"));

        dis.read();

        dis.close();
    }
}
