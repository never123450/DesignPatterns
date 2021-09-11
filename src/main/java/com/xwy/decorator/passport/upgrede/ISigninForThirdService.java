package com.xwy.decorator.passport.upgrede;


import com.xwy.decorator.passport.old.ISigninService;
import com.xwy.decorator.passport.old.ResultMsg;

/**
 * @Description
 * @author xwy
 * @date 2021/3/16
 * @param
 * @return
 */
public interface ISigninForThirdService extends ISigninService {


    public ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWechat(String openId);

    public ResultMsg loginForToken(String token);

    public ResultMsg loginForTelphone(String telphone, String code);

    public ResultMsg loginForRegist(String username, String password);


}
