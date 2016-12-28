package ru.ankanashov.areacalc.shapes;

public class Circle implements Shape {

	private float radius;
	
	public Circle(float r){
		radius = r;
	}
	
	@Override
	public float getArea() {
		return (float)Math.PI*radius*radius;
	}
	
	
	
}
