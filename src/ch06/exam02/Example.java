package ch06.exam02;

public class Example {

	public static void main(String[] args) {
		
		//객체 생성
		Car myCar = new Car(); // class 변수 선언
		
		//필드의 값을 읽기
		System.out.println(myCar.company); // myCar. : myCar 라고 하는 변수가 가지고 있는
		System.out.println(myCar.model);
		System.out.println(myCar.speed);
		System.out.println(myCar.old);
		System.out.println(myCar.price);
		
		//필드값 변경
		myCar.company = "현대자동차";
		myCar.model = "그랜저";
		myCar.price = 30000000;
		myCar.old = true;
		myCar.speed = 60;
		
		//필드의 값을 읽기
		System.out.println(myCar.company); // myCar. : myCar 라고 하는 변수가 가지고 있는
		System.out.println(myCar.model);
		System.out.println(myCar.speed);
		System.out.println(myCar.old);
		System.out.println(myCar.price);
		
		// 다른 객체 생성
		Car yourCar = new Car(); // 위의 myCar와 독립적이다.
		
		
	}

}
