package ch05;

public class Exam11 {

	public static void main(String[] args) { // main method�� �θ�
		
		int[] arr = {10, 20, 30};
		
		// index�� �̿��� for��
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		
		System.out.println();
		
		// ����� ���� ���� ��ŭ �ݺ�
		for(int value : arr) { // �ξ� ����, �ڷ� ���������� ���. Exam11.java
			System.out.print(value + ",");
		}
		
	}
	
}
