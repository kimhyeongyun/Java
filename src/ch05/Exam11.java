package ch05;

public class Exam11 {

	public static void main(String[] args) { // main method라 부름
		
		int[] arr = {10, 20, 30};
		
		// index를 이용한 for문
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		
		System.out.println();
		
		// 저장된 값의 개수 만큼 반복
		for(int value : arr) { // 훨씬 간단, 자료 구조에서도 사용. Exam11.java
			System.out.print(value + ",");
		}
		
	}
	
}
