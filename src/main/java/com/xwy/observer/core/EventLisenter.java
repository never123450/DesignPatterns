package com.xwy.observer.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 事件的注册和监听 
 * @author xwy
 * @date 2021/3/16
 * @param  
 * @return 
 */
public class EventLisenter {

    //Map相当于是一个注册器
    protected Map<Enum,Event> events = new HashMap<Enum,Event>();

    public void addLisenter(Enum eventType,Object target,Method callback){
        //注册事件
        //用反射调用这个方法
        events.put(eventType,new Event(target,callback));
    }

    private void trigger(Event e){
        e.setSource(this);
        e.setTime(System.currentTimeMillis());

        try {
            e.getCallback().invoke(e.getTarget(),e);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }


    protected void trigger(Enum call){
        if(!this.events.containsKey(call)){ return ;}
        trigger(this.events.get(call).setTrigger(call.toString()));
    }


}
