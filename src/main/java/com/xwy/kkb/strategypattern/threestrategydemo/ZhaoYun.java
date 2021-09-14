package com.xwy.kkb.strategypattern.threestrategydemo;

/**
 * @param
 * @author xwy
 * @Description 装有三个妙计的锦囊准备就绪，到了赵云执行的时候了
 * <p>
 * 注意事项优势
 * ·多重条件语句属于硬编码不易维护，而使用策略模式可以避免使用多重条件语句
 * ·策略模式提供了一系列算法，恰当的使用继承或者实现，可以把算法族里面的公共代码提到父类里面。这样就会避免重复的代码
 * ·策略模式可以提供相同行为的不同实现，客户端可以稳据具体的业务逻辑去选择合适的
 * ·策略模式完美契合开闭原则，可以在不修改或者少修改源代码的情况下，灵活增加、减少、修改新算法.l
 * ·策略模式把算法的使用放到环境类中，而算法的实现在具体策略类中，实现了二者的分离
 * <p>
 * 局限性
 * ·在实际业务逻辑非常复杂的情况下，会导致出现很多策略类
 * ·客户端必须在恰当的时候，使用恰当的算法类，才能合理完成业务逻辑
 * <p>
 * 使用场景
 * 。一个系统需要动态的在几种算法中选择一种，可以把每个算法封装到具体的策略类中。一个类中定义了多种行为，可以去代替条件转移语句，减少硬编码
 * ·系统中各个算法或者说函数是彼此独立的，而且要求对客户隐藏算法具体实现细节的时候
 * ·多个类只区别在表现行为的不同，可以使用策略模式，在运行时动态的选择要执行的行为
 * @date 14/9/2021 下午6:33
 * @return
 */
public class ZhaoYun {

    public static void main(String[] args) {

        SilkBag silkBag;

        System.out.println("-----刚刚到吴国，遇到了危险，拆开第一个");

        silkBag = new SilkBag(new BackDoor());

        silkBag.operate();

        System.out.println("-----刘备在吴国沉迷温柔乡了,拆第二个-----");

        silkBag = new SilkBag(new GreenLight());

        silkBag.operate();

        System.out.println("----回家途中遇到孙权追兵，拆第三个锦囊-----");

        silkBag = new SilkBag(new WifeHelp());

        silkBag.operate();
    }
}
