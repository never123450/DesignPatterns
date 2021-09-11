package com.xwy.factory.func;


import com.xwy.factory.Audi;
import com.xwy.factory.Car;

public class AudiFactory implements Factory {

	@Override
	public Car getCar() {
		return new Audi();
	}

}
