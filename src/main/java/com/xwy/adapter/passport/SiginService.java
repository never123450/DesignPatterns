package com.xwy.adapter.passport;


import com.xwy.adapter.ResultMsg;
import com.xwy.template.entity.Member;

/**
 * @Description
 * @author xwy
 * @date 2021/3/15
 * @param
 * @return
 */
public class SiginService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password){
        return  new ResultMsg("200","注册成功",new Member());
    }


    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return null;
    }

}
