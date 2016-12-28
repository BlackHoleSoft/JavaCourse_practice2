package ru.ankanashov.areacalc.commands;

import ru.ankanashov.areacalc.io.Console;
import ru.ankanashov.areacalc.shapes.Rect;

public class RectCommand extends AreaCommand {	
	

	public RectCommand(){		
		
		name = "rect";	
		descr = "�������. (1 ��� 2 ���.)";
		
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
		    Console.writeln("���������: " + shape.getArea());
		    return shape.getArea();
		}else{
			Console.writeln("������ ���������� ����������");
			wrongArgs = false;
			return null;
		}		
	}

}
