package ru.ankanashov.truestack;

public class Stack {
	
	private Node head;
	
	public Stack(){
		head = null;
	}
	
	public Stack(Node head){
		this.head = head;
	}
	
	public void push(Object value){
		Node tmp = head;
		head = new Node(value, tmp);		
	}
	
	public Object pop(){
		Node tmp = head;
		
		if(tmp == null){
			Console.writeln("Stack is empty!");
			return null;
		}else{
			head = tmp.getNext();
			return tmp.getValue();
		}		
	}
	
	public void print(){
		
		if(head == null) return;
		
		Node tmp = head;
		while(tmp.getNext() != null){
			Console.write(tmp.getValue()+" ");
			tmp = tmp.getNext();
		}
	}
	
}
