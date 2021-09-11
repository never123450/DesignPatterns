package com.xwy.kkb.bridgepattern;

/**
 * @Classname NoteBook
 * @Created by 寂然
 * @Description I walk very slowly, but I never walk backwards
 */
public class NoteBook extends Computer {

    public NoteBook(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("这是笔记本");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("这是笔记本");
    }

    @Override
    public void work() {
        super.work();
        System.out.println("这是笔记本");
    }
}
