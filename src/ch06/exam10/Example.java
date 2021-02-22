package ch06.exam10;

public class Example {

	public static void main(String[] args) {
		Changer changer = new Changer(); // 객체 생성
		
		//Call by Value("값"을 "복사"해서 호출한다는 의미)
		int v1 = 1; // Changer의 value와는 다른 값임.
		changer.change(v1);
		System.out.println(v1); // 2가 출력되어야하지만 1이 출력됨.
		
		//Call by Reference("번지"를 "복사"해서 호출한다는 의미)
		String v3 = "A"; // 선언하고 값을 넣은 게 아니라 A라는 번지를 넣음
		// 참조타입니깐 A라고 하는 문자열 객체의 번지가 맞음
		changer.change(v3);
		System.out.println(v3); // 역시 A가 나옴.
		// Call by Reference중에서 String만 예외...
		
		//Call by Reference("번지"를 "복사"해서 호출한다는 의미)
		int[] arr1 = {0, 0, 0};
		changer.change(arr1); // 번지가 전달이 됨. 값이 아니라
		// 배열은 객체다. heap에 만들어진다. 번지를 5번지라 가정
		// arr1 : 5번지 - > 0,0,0
		// arr2 : 
		System.out.println(arr1[0]); // 2가 나옴...왜..?
		// 번지가 복사되었기 때문에 같은 배열이 참조됨
		
		String[] arr3 = {"A", "B", "C"};
		changer.change(arr3); // 번지가 전달이 됨.
		System.out.println(arr3[0]);
		
		Member m1 = new Member(); // 객체 생성. 힙에 생성
		// 멤버 객체 안에 age : 1라는 필드가 들어있음.
		System.out.println(m1.age);
		changer.change(m1);
		System.out.println(m1.age);
	}	
	

}
