package com.xwy.delegate.leader;

/**
 * @Description  
 * @author xwy
 * @date 2021/3/15
 * @param  
 * @return 
 */
public class TargetA implements ITarget {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我现在开始干" + command + "工作");
    }
}
