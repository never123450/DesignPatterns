package com.xwy.kkb.factorypattern.abstractfactory.absorder;

import com.xwy.kkb.factorypattern.abstractfactory.abspizza.Pizza;

public interface AbsFactory {


    public Pizza createPizza(String orderType);

}
