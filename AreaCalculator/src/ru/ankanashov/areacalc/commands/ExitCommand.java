package ru.ankanashov.areacalc.commands;

public class ExitCommand extends Command {
	
	public ExitCommand() {
		name = "exit";
		descr = "�����";
	}

	@Override
	public Object execute() {		
		return name;
	}
	
	
	
}
