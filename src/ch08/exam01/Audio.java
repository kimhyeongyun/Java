package ch08.exam01;

public class Audio implements RemoteControl {
	// �ʵ�
	private int volume;
	@Override
	// �޼���
	public void turnOn() {		
		System.out.println("Audio �մϴ�.");
	}
	@Override
	public void turnOff() {		
		System.out.println("Audio ���ϴ�.");
	}
	@Override
	public void setVolume(int volume) {		
		if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		if(volume > RemoteControl.MAX_VOLUMN) {
			this.volume = RemoteControl.MAX_VOLUMN;
		}
		System.out.println("Audio�� ������ " + volume + "�� �����մϴ�.");
	}
	
	
}
