package ch06.exam01;

public class Example {

	public static void main(String[] args) {
		// ���α׷� �����
		// �������� Student�� ���� Ŭ����.
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = s1;
		
		if(s1 == s3) {
			// ���� ��ü�� �����ϳ�? No
			System.out.println("���� ��ü");
		} else {
			System.out.println("�ٸ� ��ü");
		}
		
		
	}

}
