package ch08.exam01;

// �������̽� 
public interface RemoteControl {
	// ���(������)
	/* (public static final) */ String COMPANY = "�Ｚ";
	int MAX_VOLUMN = 10;
	int MIN_VOLUME = 1;
	// ����� ������ü(�ڷ���, �����)�� ���� �� ���� ������ �����̶���� ���� �����ϰ� ���� ��, ���ȵǴ� ���� ����� �������̽��� �����ϰ� ����Ŭ�������� ����� �� 
	
	// �޼ҵ�(��ü ��� ����) - ������ �Ϸ��� ����⺸�ٴ� ������ ��ü�� ���� �� �̷��� ����� �� �־��� ������.
	/*public abstract*/ void turnOn(); // ���� {}�� ���� �޼ҵ带 �߻�޼ҵ��� ��.
	void turnOff();
	void setVolume(int volume);
	
}
