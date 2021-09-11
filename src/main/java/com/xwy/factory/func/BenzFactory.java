package com.xwy.factory.func;


import com.xwy.factory.Benz;
import com.xwy.factory.Car;

public class BenzFactory implements Factory {

	@Override
	public Car getCar() {
		return new Benz();
	}

}
