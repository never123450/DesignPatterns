package com.xwy.observer.subject;


import com.xwy.observer.core.Event;

/**
 * @Description
 * @author xwy
 * @date 2021/3/16
 * @param
 * @return
 */
public class Observer {

    public void advice(Event e){
        System.out.println("=========触发事件，打印日志========\n" + e);

        /*
        *  input
        *  input.addLisenter("click",function(){
        *
        *
        *  });
        *
        *
        * */
    }

}
