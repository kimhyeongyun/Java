package ch06homework.exam12;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed(); // 위치가 중요하구먼 
		System.out.println("현재 속도: " + speed + "km/h)");
	}
}
