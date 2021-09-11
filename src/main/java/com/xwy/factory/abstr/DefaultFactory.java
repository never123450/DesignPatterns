package com.xwy.factory.abstr;


import com.xwy.factory.Car;

public class DefaultFactory extends AbstractFactory {

	private AudiFactory defaultFactory = new AudiFactory();
	
	public Car getCar() {
		return defaultFactory.getCar();
	}

}
