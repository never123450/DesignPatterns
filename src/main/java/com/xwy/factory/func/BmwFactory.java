package com.xwy.factory.func;


import com.xwy.factory.Bmw;
import com.xwy.factory.Car;

public class BmwFactory implements Factory {

	@Override
	public Car getCar() {
		return new Bmw();
	}

}
