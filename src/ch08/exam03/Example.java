package ch08.exam03;

public class Example {

	public static void use1(Shipable shipable) {
		shipable.anchor();
		shipable.sailing();
	}
	
	public static void use2(Flyable flyable) {
		flyable.land();
		flyable.fly();
		flyable.takeoff();
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		use1(myCar);
		use2(myCar);
	}

}
