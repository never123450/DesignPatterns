package com.xwy.decorator.passport.old;

/**
 * @Description  
 * @author xwy
 * @date 2021/3/16
 * @param  
 * @return 
 */
public class SigninService implements ISigninService {

    public ResultMsg regist(String username,String password){
        return  new ResultMsg(200,"注册成功",new Member());
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
