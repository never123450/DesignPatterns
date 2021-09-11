package com.xwy.factory.abstr;


import com.xwy.factory.Bmw;
import com.xwy.factory.Car;

public class BmwFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Bmw();
	}

}
