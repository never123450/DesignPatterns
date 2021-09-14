package com.xwy.kkb.facadepattern.facadedemo1;

/**
 * @param
 * @author xwy
 * @Description 外观模式为多个复杂的子系统，‘
 * 提供了一个一致的界面。使得调用端只和这个接口发生调用，
 * 而无需关系这个子系统内部细节
 * <p>
 * 角色分析：
 * 外观类（Facade）：为调用端提供统一的调用接口，外观类将调用端请求代理给合适的对象
 * 调用者（client）：外观类的调用者
 * 子系统（SubSystem）：处理具体的业务逻辑，是功能的实际提供者
 * <p>
 * 模式总结优势
 * ·外观模式对外屏蔽了子系统的实现细节(安全性)
 * ·外观模式降低了客户端与子系统交互的复杂性，对客户端和子系统进行解耦合，子系统内部的模块更容易维护和扩展
 * ·通过合理的使用外观模式，可以帮助我们更好的划分访问层次
 * <p>
 * 使用前思考：
 * 是引入外观模式好，还是直接和子系统交互好
 * <p>
 * 使用场景
 * 对分层系统进行构建时，使用外观模式可以简化子系统之间的依赖关系
 * 当有一个复杂的系统，里面有很多子系统，有大量操作，这时候可以使用外观模式
 * 当客户端与多个子系统之间存在很多耦合是时，引入外观模式，可以将他们分离，提高子系统的独立性和可移植性
 * @date 14/9/2021 上午10:10
 * @return
 */
public class Client {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.ready();

        homeTheaterFacade.play();

        homeTheaterFacade.end();
    }
}
