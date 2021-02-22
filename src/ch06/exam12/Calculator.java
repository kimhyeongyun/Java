package ch06.exam12;

public class Calculator {
	//Field
	static double pi = 3.14159;
	int memory;
	//Constructor
	
	//Method
	static void plus(int x, int y) {
		int result = x + y;
		System.out.println(result);
	}
		
	
	void plus1(int x, int y) {
		memory = x + y;
		System.out.println(memory);	
	}
}
