package ch06.exam09;

public class Calculator {
	// 필드, 생성자, 메서드
	
	// 기본 생성자는 기본적으로 만들어짐
	Calculator() {
		
	}
	
	double area(int w) {
		return w * w;
	}
	
	
	// 정사각형 면적
	double area(double w) { // 위의 식(int w)가 없으면 10이 들어오면 double w로 선택이 될 수 있음. 자동타입변환이 될 수 있는 타입을 찾음
		return w * w;
	}
	
	// 직사각형 면적
	double area(double w, double h) {
		return w * h;
	}
	
	// 원의 면적
//	double area(double r) {  // 이거 안됨 (int r)은 가능
//		return				 // 이거 안됨
//	} 						 // 이거 안됨
	
	// 원의 면적
	double areaCircle(double r) {
		return r * r * Math.PI;
		
	}
	
	
}
