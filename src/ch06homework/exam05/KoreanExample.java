package ch06homework.exam05;

public class KoreanExample {
	public static void main(String[] args) {
		
		Korean k1 = new Korean("���ڹ�", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.name : " + k1.ssn);
		
		Korean k2 = new Korean("���ڹ�", "013225-1234567");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.name : " + k2.ssn);
	}
}
