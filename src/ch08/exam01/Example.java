package ch08.exam01;

public class Example {

	public static void main(String[] args) {
		
		RemoteControl rc= new Audio();
		//rc = new Television(), rc = new Audio() �ε� ��밡��.	
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(5);

//		RemoteControl rc2 = new Television();
		// ��ü�� ���� �����������ٰ� ������ �����Ѵٰ� �ؼ�
		// �װͺ��ٴ� �������̽� ����Ʈ��Ʈ���� ������ ���� 
		// �ڷ����� or ������� ����Ϸ��� �Ѵ�.
		
	}

}
