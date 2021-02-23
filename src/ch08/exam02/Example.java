package ch08.exam02;

public class Example {
			// static 이유인 이유: 안쓰면 인스턴스 메서드가됨. 그러면  Example e = new Example();
	                                                    //e = 
	public static void method(RemoteControl rc) { // 인터페이스로 사용가능한 객체만 올 수 있음.(implements )
		// 인터페이스의 설명대로만 사용하는 코드
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(5);
	}

	public static void main(String[] args) {
		RemoteControl rc= new Audio();
		//rc = new Television(), rc = new Audio() 로도 사용가능.	
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(5);
//		RemoteControl rc2 = new Television();
		// 객체를 만들어서 참조변수에다가 번지를 대입한다고 해석
		// 그것보다는 인터페이스 리모트컨트롤을 가지고 내가 
		// 텔레비전 or 오디오를 사용하려고 한다.
		
		method(new Television());
		method(new Audio());
	}

}
