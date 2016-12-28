package ru.ankanashov.areacalc.io;

import java.util.ArrayList;

import ru.ankanashov.areacalc.commands.CircleCommand;
import ru.ankanashov.areacalc.commands.Command;
import ru.ankanashov.areacalc.commands.ExitCommand;
import ru.ankanashov.areacalc.commands.NullCommand;
import ru.ankanashov.areacalc.commands.RectCommand;
import ru.ankanashov.areacalc.commands.TriangleCommand;

public class CommandReader {
	
	/*public static final String RECT_CMD = "rect";
	public static final String QUAD_CMD = "quad";
	public static final String CIRCLE_CMD = "circle";
	public static final String TRIANGLE_CMD = "triangle";
	public static final String EXIT_CMD = "exit";*/
	
	private String cmdName;
	private ArrayList<String> cmdArgs;
	private boolean hasRead;
	
	private ArrayList<Command> commands;
	private NullCommand nullCmd;
	
	public CommandReader(){
		cmdArgs = new ArrayList<String>();
		commands = new ArrayList<Command>();
		commands.add(new RectCommand());
		commands.add(new TriangleCommand());
		commands.add(new CircleCommand());
		commands.add(new ExitCommand());
		
		nullCmd = new NullCommand();		
	}
	
	public void readCommand(){
		Console.writeln(" оманды:");
		for(Command c : commands){
			Console.writeln(c.getName() + " - " + c.getDescription()); 
		}
		Console.writeln("¬ведите команду (exit дл€ выхода):");
		
		String line = Console.read();
		
		String[] parts = line.split(" ");
		
		cmdName = parts[0];
		cmdArgs.clear();
		for(int i=1; i<parts.length; i++){
			cmdArgs.add(parts[i]);
		}
		
		hasRead = true;
	}
	
	public String getName(){
		return cmdName;
	}
	
	public String getArgument(int index){
		if(index >= cmdArgs.size()){
			return null;
		}else{
			return cmdArgs.get(index);
		}
	}
	
	public int getArgumentsCount(){
		return cmdArgs.size();
	}
	
	public Command getCommand(){
		if(hasRead){
			
			Object[] args;
			try{
				args = new Object[cmdArgs.size()];
				for(int i=0; i<args.length; i++){
					args[i] = Float.parseFloat(cmdArgs.get(i));
				}
			}catch(NumberFormatException e){
				e.printStackTrace();
				return nullCmd;
			}
			
			for(Command c : commands){
				if(c.getName().equals(cmdName)){
					c.putArgs(args);
					return c;
				}
			}
			return nullCmd; //возвращаем нулевую команду, если не найдена така€ команда
			
		}else return nullCmd;
	}
		
}
