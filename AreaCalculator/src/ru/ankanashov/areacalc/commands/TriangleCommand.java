package ru.ankanashov.areacalc.commands;

import ru.ankanashov.areacalc.io.Console;
import ru.ankanashov.areacalc.shapes.Triangle;

public class TriangleCommand extends AreaCommand {

    public TriangleCommand(){		
		
		name = "triangle";	
		descr = "треугольн. (3 стороны)";
		
	}	

	@Override
	public void putArgs(Object[] args) {		
		super.putArgs(args);		
		
		if(args.length == 3){
			shape = new Triangle((float)args[0], (float)args[1], (float)args[2]);
		}else{
			wrongArgs = true;
		}
	}

	@Override
	public Object execute() {		
		if(!wrongArgs){ 
		    Console.writeln("Результат: " + shape.getArea());
		    return shape.getArea();
		}else{
			Console.writeln("Ошибка количества аргументов");
			wrongArgs = false;
			return null;
		}		
	}	
}
