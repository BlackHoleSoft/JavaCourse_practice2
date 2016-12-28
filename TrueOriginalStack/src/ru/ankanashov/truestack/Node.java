package ru.ankanashov.truestack;

public class Node {
	
	private Node next;
	private Object value;	
	
	public Node(Object val, Node next){
		this.next = next;
		value = val;
	}
	
	public Node getNext(){
		return next;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}	
	
}
