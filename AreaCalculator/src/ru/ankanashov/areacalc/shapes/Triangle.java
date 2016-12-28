package ru.ankanashov.areacalc.shapes;

public class Triangle implements Shape {
	
	private float sideA, sideB, sideC;
	private float perimeter;
	
	public Triangle(float a, float b, float c){
		sideA = a;
		sideB = b;
		sideC = c;
		perimeter = a+b+c;
	}

	@Override
	public float getArea() {
		float p = perimeter/2;
		float result = (float)Math.sqrt(p * (p-sideA) * (p-sideB) * (p-sideC));
		return result;
	}	
	
}
