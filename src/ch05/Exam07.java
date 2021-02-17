package ch05;

public class Exam07 {

	public static void main(String[] args) { // main method라 부름
		
		int[] scores = {90, 85, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
		double avg = (double) sum / scores.length; // 매우 중요!!!!!! 정수 나누기 정수는 정수가 나오므로 하나를 double로 바꿔야함.
		System.out.println("평균: " + avg);
		
	}
	
}
