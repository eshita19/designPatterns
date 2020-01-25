package com.esh.structural;

interface Car {
	void assemble();
}

class BasicCar implements Car {
	@Override
	public void assemble() {
		System.out.println("Basic  car assemble");
	}
}

class CarDecorator implements Car {
	Car car;

	CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void assemble() {
		car.assemble();
	}
}

class LuxuryCar extends CarDecorator {
	LuxuryCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Luxury  car assemble");
	}
}

class SportCar extends CarDecorator {
	SportCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Sports  car assemble");
	}
}

public class DecoratorEx {
	public static void main(String[] args) {
		Car car = new LuxuryCar(new SportCar(new BasicCar()));
		car.assemble();
	}
}
