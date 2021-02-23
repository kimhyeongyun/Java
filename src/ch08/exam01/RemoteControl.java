package ch08.exam01;

// 인터페이스 
public interface RemoteControl {
	// 상수(고정값)
	/* (public static final) */ String COMPANY = "삼성";
	int MAX_VOLUMN = 10;
	int MIN_VOLUME = 1;
	// 상수는 구형객체(텔레비, 오디오)를 만들 때 값을 제안할 목적이라든지 값을 참조하고 싶을 때, 제안되는 값을 상수로 인터페이스에 참조하고 구형클래스에서 사용할 수 
	
	// 메소드(객체 사용 설명) - 실행을 하려고 만들기보다는 앞으로 객체를 만들 때 이렇게 사용할 수 있어라고 설명함.
	/*public abstract*/ void turnOn(); // 끝에 {}가 없는 메소드를 추상메소드라고 함.
	void turnOff();
	void setVolume(int volume);
	
}
