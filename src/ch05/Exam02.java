package ch05;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) { // main method라 부름
		// 변수를 선언하면서 값 목록을 제공할 경우
		int[] scores1 = {90, 85, 95};
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);
		
		// 변수를 선언한 후 값 목록을 제공할 경우
		int[] scores2 = null;
		scores2 = new int[] {10, 20, 30}; // 그냥 외우자. 이유를 굳이 설명하자면 컴파일러는 scores2가 참조변수인 것만 알지 
		//이것이 배열 변수인 모르므로 
		
		// method 호출
		add(scores2); // call by reference
		add(scores1);
		add(new int[] {100, 200, 300}); // 이거 왜 안되는 이유? 그래서 new int[] 이거를 넣어줘야함.
	}
	
	// method 선언
	public static void add(int[] arr) { // add method라 부름
		System.out.println("값:" + Arrays.toString(arr)); // Arrays.toString(arr)대신 arr을 출력하면 번지가 나옴. 완전 이상한 값이 나옴.
	}
}
