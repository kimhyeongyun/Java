package ch08.exam02;

public class Television implements RemoteControl /* 필수 */{
	
	@Override // 안붙는 이유: @를 붙이면 컴파일러가 확인해주므로 가급적이면 @Override 붙여주기.
	public void turnOn() { // 재정의할 때는 항상 public보다 더 크게, 고로 public만 해야함. 왜냐 RemoteControl이 public 이므로 
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		System.out.println("TV 볼륨을 " + volume + "로 조절합니다.");
	}
}
