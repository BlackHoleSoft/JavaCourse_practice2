package ru.ankanashov.areacalc;

import ru.ankanashov.areacalc.commands.Command;
import ru.ankanashov.areacalc.commands.ExitCommand;
import ru.ankanashov.areacalc.io.*;

public class Program {

	public static void main(String[] args) {	
		
		boolean running = true;
		
		CommandReader reader = new CommandReader();
		while(running){
			reader.readCommand();
			Object result = reader.getCommand().execute();
			if(result != null && result.equals("exit")) running = false;
		}		
		Console.writeln("Завершение программы");
		Console.close();

	}

}
