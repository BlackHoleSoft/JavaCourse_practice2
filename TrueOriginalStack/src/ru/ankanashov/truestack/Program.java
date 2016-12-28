package ru.ankanashov.truestack;

public class Program {

	public static void main(String[] args) {
		
		String inp = "";
		Stack s = new Stack();
		int i=0;
		while(true){
			Console.writeln("\n+ push; - pop; any key - exit");
			inp = Console.read();
			if(inp.equals("+")){
				Console.writeln("Кладем: "+i);
				s.push(i);
			}else if(inp.equals("-")){
				Object result;
				if((result = s.pop()) != null){					
					Console.writeln("Достали: "+(int)result);				
				}
			}else{
				System.exit(0);
			}
			
			s.print();
			i++;
		}
		
	}

}
