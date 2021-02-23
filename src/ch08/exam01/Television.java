package ch08.exam01;

public class Television implements RemoteControl /* �ʼ� */{
	private int volume;
	
	@Override // �Ⱥٴ� ����: @�� ���̸� �����Ϸ��� Ȯ�����ֹǷ� �������̸� @Override �ٿ��ֱ�.
	public void turnOn() { // �������� ���� �׻� public���� �� ũ��, ��� public�� �ؾ���. �ֳ� RemoteControl�� public �̹Ƿ� 
		System.out.println("TV�� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		
		if(volume > RemoteControl.MAX_VOLUMN) {
			this.volume = RemoteControl.MAX_VOLUMN;
		}
		
		System.out.println("TV ������ " + volume + "�� �����մϴ�.");			
		
	}
}
