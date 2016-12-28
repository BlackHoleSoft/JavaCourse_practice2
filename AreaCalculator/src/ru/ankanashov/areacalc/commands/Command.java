package ru.ankanashov.areacalc.commands;

public abstract class Command {
	
	protected String name;
	protected String descr;
	protected Object[] args;
	
	public abstract Object execute();
	
	public void putArgs(Object[] args){
		this.args = args;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return descr;
	}
	
}
