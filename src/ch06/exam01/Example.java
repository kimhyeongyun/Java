package ch06.exam01;

public class Example {

	public static void main(String[] args) {
		// 프로그램 실행용
		// 나머지는 Student와 같은 클래스.
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = s1;
		
		if(s1 == s3) {
			// 같은 객체를 참조하냐? No
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		
	}

}
