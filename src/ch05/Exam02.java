package ch05;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) { // main method�� �θ�
		// ������ �����ϸ鼭 �� ����� ������ ���
		int[] scores1 = {90, 85, 95};
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);
		
		// ������ ������ �� �� ����� ������ ���
		int[] scores2 = null;
		scores2 = new int[] {10, 20, 30}; // �׳� �ܿ���. ������ ���� �������ڸ� �����Ϸ��� scores2�� ���������� �͸� ���� 
		//�̰��� �迭 ������ �𸣹Ƿ� 
		
		// method ȣ��
		add(scores2); // call by reference
		add(scores1);
		add(new int[] {100, 200, 300}); // �̰� �� �ȵǴ� ����? �׷��� new int[] �̰Ÿ� �־������.
	}
	
	// method ����
	public static void add(int[] arr) { // add method�� �θ�
		System.out.println("��:" + Arrays.toString(arr)); // Arrays.toString(arr)��� arr�� ����ϸ� ������ ����. ���� �̻��� ���� ����.
	}
}
