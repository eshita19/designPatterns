package com.esh.structural;

interface Color {
	void applyColor();
}

class RedColor implements Color{
	@Override
	public void applyColor() {
		System.out.println("Red color");
	}
}

abstract class Shape2 {
	Color color;

	Shape2(Color color) {
		this.color = color;
	}

	abstract void applyColor();
}

class Rectangle2 extends Shape2 {
	Rectangle2(Color color) {
		super(color);
	}

	@Override
	void applyColor() {
		this.color.applyColor();
	}
}

public class BridgeEx {
	public static void main(String[] args) {
		new Rectangle2(new RedColor()).applyColor();
	}
}
