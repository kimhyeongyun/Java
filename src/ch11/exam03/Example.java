package ch11.exam03;

import java.util.Date;

public class Example {

	public static void method() {
		long sum = 0;
		for(int i=0; i < 1000000; i++) {
			sum += i;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.nanoTime();
		method();
		long end = System.nanoTime();
		System.out.println("���� �ð�: " + (end - start) + "ms");
	}
	

}
