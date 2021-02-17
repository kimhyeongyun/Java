package ch05;

public class Exam08 {

	public static void main(String[] args) { // main method라 부름
		
		int[][] scores = {
				{10, 20},
				{15, 25, 35},
				{45, 55, 65, 75}
		};
		
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println(scores[2].length);
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) { // 3번 반복
			int[] ban = scores[i]; // 
			for(int k=0; k<ban.length; k++) {
				//System.out.print(ban[k] + ","); // print 주의
				sum += ban[k];
			}
			
			double avg = (double) sum / 
					(scores[0].length + 
					 scores[1].length + 
					 scores[2].length);
			
			System.out.println("AVG: " + avg); 
		}
		
		
	}
	
}
