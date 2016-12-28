package ru.ankanashov.areacalc.io;

import java.util.Scanner;

public class Console {	
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void write(String str){
		System.out.print(str);
	}
	
	public static void writeln(){
		System.out.println();
	}
	
	public static void writeln(String str){
		System.out.println(str);
	}
	
	public static String read(){		
		String str = "";
		str = sc.nextLine();
		//sc.close();
		return str;
	}
	
	public static void close(){
		sc.close();
	}
	
}
