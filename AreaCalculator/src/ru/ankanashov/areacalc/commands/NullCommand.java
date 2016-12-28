package ru.ankanashov.areacalc.commands;

import ru.ankanashov.areacalc.io.Console;

public class NullCommand extends Command {

	public NullCommand() {
		name = "null";
	}

	@Override
	public Object execute() {
		Console.writeln("Такой команды не существует!");
		return null;
	}
	
}
