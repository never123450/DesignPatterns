package com.xwy.kkb.flyweightpattern.flyweightdemo;

/**
 * @param
 * @author xwy
 * @Description 使用享元模式完成业务逻辑
 * 享元模式（FlyWieght Pattern）
 * 运用共享技术，有效的支持大量细粒度的对象
 * 享元模式就是池技术的重要实现方式
 * <p>
 * Flyweight：抽象的享元角色，他是抽象的产品类，同时会定义出对象的内部状态和外部状态
 * ConcreFlyWeight：是具体的产品类，实现抽象角色，实现具体的业务逻辑
 * UnsharedConcreteFlyWeight：不可共享的角色，这个角色也可能出现在享元模式中
 * FlyWrightFactory：享元工厂类，用于构建一个池的容器，同时在享元工厂里会提供公共方法（从池子里获取对象， 获取池子里的对象总数，根据key获取对象）
 * Client：客户端，使用享元模式完成业务逻辑
 * <p>
 * 内部状态&外部状态
 * 对象的信息分为两个部分，内部状态和外部状态
 * 内部状态
 * 是指对象共享出来的信息，存储在享元对象内部，不随着环境的改变而改变外部状态
 * 随着环境的改变而改变，不可共享的状态
 * <p>
 * 优势：
 * 节省内存空间，重复对象需要被创建的时候，享元模式由于只会创建一次，所以对系统的内存空间的需求大大减少
 * 提高使用率，对于可重复的对象只创建一次，再次访问时从池子里拿，响应速度更快，效率更高
 * <p>
 * 局限性：
 * 享元模式会提高系统的复杂度，需要有一个工厂控制
 * <p>
 * 使用场景：
 * 各类池技术
 *
 * @date 14/9/2021 下午2:21
 * @return
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
