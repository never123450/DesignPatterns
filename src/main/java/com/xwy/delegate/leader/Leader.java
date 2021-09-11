package com.xwy.delegate.leader;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description  
 * @author xwy
 * @date 2021/3/15
 * @param  
 * @return 
 */
public class Leader implements  ITarget {

    private Map<String,ITarget> targets = new HashMap<String,ITarget>();

    public Leader() {
        targets.put("加密",new TargetA());
        targets.put("登录",new TargetB());
    }

    //项目经理自己不干活
    public void doing(String command){
        targets.get(command).doing(command);
    }

}
