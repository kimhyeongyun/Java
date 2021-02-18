package ch05;

public class Exam10 {

	public static void main(String[] args) { // main method라 부름
		
		int[] scores1 = {85, 90, 95};
		int[] scores2 = new int[scores1.length + 2];
		
		System.arraycopy(scores1, 0, scores2, 2, scores1.length); // 000() : method "호출"이라 부릅니다.
		
		for(int i=0; i<scores2.length; i++) {
			System.out.print(scores2[i] + ",");
		}
		
	}
	
}
