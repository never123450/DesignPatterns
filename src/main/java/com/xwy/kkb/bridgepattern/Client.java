package com.xwy.kkb.bridgepattern;

/**
 * @Classname Client
 * @Created by 寂然
 * @Description I walk very slowly, but I never walk backwards
 */
public class Client {

    public static void main(String[] args) {

        NoteBook noteBook = new NoteBook(new XiaoMi());

        noteBook.open();

        noteBook.work();

        noteBook.close();

        DeskPC deskPC = new DeskPC(new Huawei());

//        deskPC.work();
//
//        deskPC.close();

    }
}
