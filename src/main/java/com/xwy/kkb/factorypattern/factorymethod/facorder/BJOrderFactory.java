package com.xwy.kkb.factorypattern.factorymethod.facorder;

import com.xwy.kkb.factorypattern.abstractfactory.abspizza.BJFruitPizza;
import com.xwy.kkb.factorypattern.abstractfactory.abspizza.BJGreekPizza;
import com.xwy.kkb.factorypattern.abstractfactory.abspizza.Pizza;

/**
 * @Classname BJOrderFactory
 * @Created by 寂然
 * @Description 北京的工厂子类
 */
public class BJOrderFactory extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        if (orderType.equals("GreekPizza")){

            pizza = new BJGreekPizza();
        } else if (orderType.equals("FruitPizza")){

            pizza = new BJFruitPizza();
        }

        return pizza;
    }
}
