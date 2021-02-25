package ch10.exam01;

import java.io.FileInputStream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 예외는 2종류가 있음.
		
		int[] arr = null;
		arr[0]  = 10; // NullPointerException => 실행 예외(컴파일러가 체크하지 않음)
		
		              // FileNotFoundExcemption => 일반 예외(컴파일 체크 에러)
		//FileInputStream fi = new FileInputStream("C:/Temp/file.txt");
		
	}

}
