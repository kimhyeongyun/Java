package ch08.exam02;

public class Example {
			// static ������ ����: �Ⱦ��� �ν��Ͻ� �޼��尡��. �׷���  Example e = new Example();
	                                                    //e = 
	public static void method(RemoteControl rc) { // �������̽��� ��밡���� ��ü�� �� �� ����.(implements )
		// �������̽��� �����θ� ����ϴ� �ڵ�
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(5);
	}

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
		
		method(new Television());
		method(new Audio());
	}

}
