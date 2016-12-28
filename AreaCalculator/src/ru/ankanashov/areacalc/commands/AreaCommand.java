package ru.ankanashov.areacalc.commands;

import ru.ankanashov.areacalc.shapes.Shape;

public abstract class AreaCommand extends Command {
	
    protected Shape shape;
	protected boolean wrongArgs;		
}
