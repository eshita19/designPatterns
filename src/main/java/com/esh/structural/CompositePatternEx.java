package com.esh.structural;

import java.util.ArrayList;
import java.util.List;

interface Shape{
	void draw(int fillColor);
}

class Circle implements Shape{
	@Override
	public void draw(int fillColor) {
		System.out.println("Filling Circle with " + fillColor);
	}
}
class Rectangle implements Shape{
	@Override
	public void draw(int fillColor) {
		System.out.println("Filling Rectangle with " + fillColor);
	}
}

class Drawing{
	List<Shape> shapes = new ArrayList<>();
	void add(Shape shape){
		shapes.add(shape);
	}
	void remove(Shape shape){
		 shapes.remove(shape);
	}
	
	void drawShapes(){
		for(Shape shape: shapes){
			shape.draw(123);
		}
	}
}
public class CompositePatternEx {
	public static void main(String[] args) {
		Drawing drawing = new Drawing();
		drawing.shapes.add(new Circle());
		drawing.shapes.add(new Rectangle());
		drawing.drawShapes();
	}
}
