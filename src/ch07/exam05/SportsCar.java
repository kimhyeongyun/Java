package ch07.exam05;

public class SportsCar extends Car {
	// 필드
	// 생성자
	// 메서드
	
	// 재정의가 안됨
//	public void stop() {
//		System.out.println("멈춥니다.");
//	}
	
	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}
	
}
