package com.xwy.kkb.compositepattern.compositedemo;

/**
 * @param
 * @param null
 * @author xwy
 * @Description 客户端，组合模式
 * 组合模式，又叫部分整体模式，它创建了对象组的数据结构（将对象组合成树状结构，用来表示部分整体的层级关系）
 * 组合模式使得用户对单个对象和组合对象的访问具有一致性
 * <p>
 * 優勢：
 * 组合模式可以使得客户端代码可以一致的处理单个对象和组合对象，
 * 无须关心自己处理的是单个还是组合，屏蔽了对象系统的层次差异性，
 * 这样的话一致的行为就可以控制不同层次了
 * 扩展性非常高，可以很方便的增加叶子节点和非叶子节点，并且对于现有的类库无侵入，满足开闭原则
 * <p>
 * 局限性：
 * 如果說各个节点差異很大的話，不適合使用組合模式
 * <p>
 * 使用场景：
 * 处理树形结构，具备统一行为，可以考虑使用组合模式
 * 想体现对象的部分，整体结构的时候，可以使用组合模式。典型一点的案例如文件和文件夹
 * @date 11/9/2021 下午9:48
 * @return
 */
public class Client {

    public static void main(String[] args) {

        //范围1从大到小创建对象
        Component school = new School("清华大学", "中国高等学府");

        //创建学院，添加到学校中
        Component computerCollege = new College("计算机学院", "计算机学院");

        Component infoCollege = new College("信息工程学院", "信息工程学院");

        school.add(computerCollege);

        school.add(infoCollege);

        //创建各个学院下面的专业，并且加入到学院中

        computerCollege.add(new Major("计算机科学与技术", "计算机科学与技术"));

        computerCollege.add(new Major("软件工程", "软件工程"));

        computerCollege.add(new Major("网络空间安全", "网络空间安全"));

        infoCollege.add(new Major("通信专业", "通信专业"));

        infoCollege.add(new Major("信号与信息处理", "信号与信息处理"));

        infoCollege.add(new Major("信息网格与复杂系统", "信息网格与复杂系统"));

        //进行院校展示
//        school.show();
//        computerCollege.show();
        school.remove(infoCollege);

        school.show();

        System.out.println("---------------------");

        school.add(infoCollege);

        school.show();


    }
}
