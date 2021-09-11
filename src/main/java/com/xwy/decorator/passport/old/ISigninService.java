package com.xwy.decorator.passport.old;

/**
 * @Description  
 * @author xwy
 * @date 2021/3/16
 * @param  
 * @return 
 */
public interface ISigninService {
    public ResultMsg regist(String username, String password);


    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password);
}
