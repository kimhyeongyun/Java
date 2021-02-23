package ch08.exam01;

public class Audio implements RemoteControl {
	// 필드
	private int volume;
	@Override
	// 메서드
	public void turnOn() {		
		System.out.println("Audio 켭니다.");
	}
	@Override
	public void turnOff() {		
		System.out.println("Audio 끕니다.");
	}
	@Override
	public void setVolume(int volume) {		
		if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		if(volume > RemoteControl.MAX_VOLUMN) {
			this.volume = RemoteControl.MAX_VOLUMN;
		}
		System.out.println("Audio의 볼륨을 " + volume + "로 조절합니다.");
	}
	
	
}
