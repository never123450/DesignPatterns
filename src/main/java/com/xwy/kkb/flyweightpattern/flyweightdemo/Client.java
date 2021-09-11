package com.xwy.kkb.flyweightpattern.flyweightdemo;

/**
 * @Classname Client
 * @Created by 寂然
 * @Description 使用享元模式完成业务逻辑
 */
public class Client {

    public static void main(String[] args) {

        //创建一个享元工厂
        WebsiteFactory websiteFactory = new WebsiteFactory();

        Website news = websiteFactory.getWebsite("news");

        news.show(new User("老李"));

        Website wechat = websiteFactory.getWebsite("Wechat");

        wechat.show(new User("老高"));

        websiteFactory.getWebsiteCount();

        Website wechat1 = websiteFactory.getWebsite("Wechat");

        wechat.show(new User("老沈"));

        Website wechat2 = websiteFactory.getWebsite("Wechat");

        wechat.show(new User("老刘"));

        Website wechat3 = websiteFactory.getWebsite("Wechat");

        wechat.show(new User("老黄"));

        websiteFactory.getWebsiteCount();

    }
}
