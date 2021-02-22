package ch06.exam10;

public class Changer {

	// 필드 생성자 메서드 다 생성가능, 메서드 위주로 살필 것
	void change(int v2) { // 기본타입
		v2 = 2;
	}
					// V3	
	void change(String v4) { // 참조타입
		v4 = "B"; // B라고 하는 값을 V4에 대입했다.
		// 
	}
				// 번지 5 대입
	void change(int [] arr2) { // 참조타입
		arr2[0] = 2;  // 번지가 복사되었기 때문에 같은 배열이 참조됨
	}
	
						// 번지 7 대입
	void change(String [] arr4) { // 참조타입
		arr4[0] = "B";
	}
	
	void change(Member m2) {
		m2.age = 2; // m2가 참조하는 객체로 가서 
	}
	
	
}
