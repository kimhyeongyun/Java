package ch05;

public class Exam04 {

	public static void main(String[] args) { // main method라 부름
		// 변수를 선언하면서 값 목록을 제공할 경우
		int[] arr1 = new int[10]; // int타입 배열 변수 arr1 선언한다. / 새로 객체를 만든다. int값이 3개가 들어갈 수 있는 배열을 만든다.
		for(int i=0; i < arr1.length; i++) { // .의 의미: ~에 가서 를 의미한다. arr1이 참조하는 00번지로 가서 길이를 참조하라.
			System.out.println(arr1[i]); // for문은 총 3번 반복
			
		}
		
		double[] arr2 = new double[3]; 
		for(int i=0; i < arr2.length; i++) { 
			System.out.println(arr2[i]); 
			
		}
		
		boolean[] arr3 = new boolean[3]; 
		for(int i=0; i < arr3.length; i++) { 
			System.out.println(arr3[i]); 
			
		}
		
		String[] arr4 = new String[3]; 
		for(int i=0; i < arr4.length; i++) { 
			System.out.println(arr4[i]); 
			
		}
		
		
	}
	
}
