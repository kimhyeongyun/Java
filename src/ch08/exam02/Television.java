package ch08.exam02;

public class Television implements RemoteControl /* �ʼ� */{
	
	@Override // �Ⱥٴ� ����: @�� ���̸� �����Ϸ��� Ȯ�����ֹǷ� �������̸� @Override �ٿ��ֱ�.
	public void turnOn() { // �������� ���� �׻� public���� �� ũ��, ��� public�� �ؾ���. �ֳ� RemoteControl�� public �̹Ƿ� 
		System.out.println("TV�� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		System.out.println("TV ������ " + volume + "�� �����մϴ�.");
	}
}
