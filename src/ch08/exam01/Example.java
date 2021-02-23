package ch08.exam01;

public class Example {

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
		
	}

}
