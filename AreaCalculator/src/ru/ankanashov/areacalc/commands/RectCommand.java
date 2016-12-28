package ru.ankanashov.areacalc.commands;

import ru.ankanashov.areacalc.io.Console;
import ru.ankanashov.areacalc.shapes.Rect;

public class RectCommand extends AreaCommand {	
	

	public RectCommand(){		
		
		name = "rect";	
		descr = "прямоуг. (1 или 2 арг.)";
		
	}
	
	

	@Override
	public void putArgs(Object[] args) {		
		super.putArgs(args);
		
		if(args.length == 1){
			shape = new Rect((float)args[0]);
		}else if(args.length == 2){
			shape = new Rect((float)args[0], (float)args[1]);
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
