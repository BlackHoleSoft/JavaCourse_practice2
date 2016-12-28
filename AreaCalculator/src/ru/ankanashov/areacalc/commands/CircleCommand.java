package ru.ankanashov.areacalc.commands;

import ru.ankanashov.areacalc.io.Console;
import ru.ankanashov.areacalc.shapes.Circle;

public class CircleCommand extends AreaCommand {
	
public CircleCommand(){		
		
		name = "circle";	
		descr = "���� (1 ���.)";
		
	}	

	@Override
	public void putArgs(Object[] args) {		
		super.putArgs(args);		
		
		if(args.length == 1){
			shape = new Circle((float)args[0]);
		}else{
			wrongArgs = true;
		}
	}

	@Override
	public Object execute() {		
		if(!wrongArgs){ 
		    Console.writeln("���������: " + shape.getArea());
		    return shape.getArea();
		}else{
			Console.writeln("������ ���������� ����������");
			wrongArgs = false;
			return null;
		}		
	}	
	
}
