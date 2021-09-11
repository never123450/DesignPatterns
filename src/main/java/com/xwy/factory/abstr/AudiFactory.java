package com.xwy.factory.abstr;


import com.xwy.factory.Audi;
import com.xwy.factory.Car;

//具体的业务逻辑封装
public class AudiFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Audi();
	}

}
