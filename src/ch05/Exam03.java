package ch05;

import java.util.Arrays;

public class Exam03 {

	public static void main(String[] args) { // main method라 부름
		// 변수를 선언하면서 값 목록을 제공할 경우
		int[] scores1 = {90, 85, 95};
		int[] scores2 = {90, 85, 95};
		int[] scores3 = scores1;
		
		System.out.println(scores1 == scores2); // 같은 객체(번지)를 참조하냐고 물어보는 것. 하지만 scores1와 scores2의 번지값은 다름
		System.out.println(scores1 == scores3); // scores1와 scores3의 번지 값이 같음. 
	}
	
}
