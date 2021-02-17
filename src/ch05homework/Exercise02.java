package ch05homework;

public class Exercise02 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int count = 0;
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<array.length; i++) { // 3번 반복
			for(int k=0; k<array[i].length; k++) {
				//System.out.print(ban[k] + ","); // print 주의
				sum += array[i][k];
				count ++;
			}
		}
		
		avg = (double) sum / count; 
		System.out.println("sum: " + sum); 
		System.out.println("avg: " + avg); 
	}

}
