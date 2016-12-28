package ru.ankanashov.areacalc.shapes;

public class Rect implements Shape {
	
	private float width, height;
	
	public Rect(){
		this(1);
	}
	
	public Rect(float a){
		width = a;
		height = a;
	}
	
	public Rect(float width, float height){
		this.width = width;
		this.height = height;
	}

	@Override
	public float getArea() {		
		return width * height;
	}
	
	
	
}
