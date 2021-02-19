package ch06.exam03;

public class Car {
	
	//Field
	String company;
	String model;
	int price;
	int speed;
	boolean old;
	
	//이 자리에 생성자가 있어야 작성안하면 기본생성자가 생성됨
	Car() /* 생성자라 부름 */ {
		System.out.println("객체 생성됨");
	} // 생성자 생성 시 주의할점 : 중괄호, 이름똑같, ()
	
	// 보통 기본적으로 만들어줌.
}
