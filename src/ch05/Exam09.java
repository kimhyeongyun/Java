package ch05;

public class Exam09 {

	public static void main(String[] args) { // main method�� �θ�
		
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
		int count = 0;
		for(int i=0; i<scores.length; i++) { // 3�� �ݺ�
			for(int k=0; k<scores[i].length; k++) {
				//System.out.print(ban[k] + ","); // print ����
				sum += scores[i][k];
				count ++;
			}
		}
		
		double avg = (double) sum / count; 
		System.out.println("AVG: " + avg); 
		
	}
	
}