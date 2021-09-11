package com.xwy.kkb.adapterpattern.InputStreamReaderDemo;

import java.io.*;

/**
 * @Classname InputStreamReaderDemo
 * @Created by 寂然
 * @Description InputStreamReader
 */
public class InputStreamReaderDemo {

    public static void main(String[] args) throws IOException {
        //字节输入流
        InputStream is = System.in ;

        Reader r = new InputStreamReader(is) ;

        FileWriter fw = new FileWriter("d.txt") ;

        char[] chs = new char[1024] ;

        int len ;

        while((len = r.read(chs))!=-1){

            fw.write(chs, 0, len);

            fw.flush();
        }

        r.close();

        fw.close();
    }
}
