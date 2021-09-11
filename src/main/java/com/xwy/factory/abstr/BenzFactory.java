package com.xwy.factory.abstr;


import com.xwy.factory.Benz;
import com.xwy.factory.Car;

public class BenzFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Benz();
	}

}
