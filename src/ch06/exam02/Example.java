package ch06.exam02;

public class Example {

	public static void main(String[] args) {
		
		//��ü ����
		Car myCar = new Car(); // class ���� ����
		
		//�ʵ��� ���� �б�
		System.out.println(myCar.company); // myCar. : myCar ��� �ϴ� ������ ������ �ִ�
		System.out.println(myCar.model);
		System.out.println(myCar.speed);
		System.out.println(myCar.old);
		System.out.println(myCar.price);
		
		//�ʵ尪 ����
		myCar.company = "�����ڵ���";
		myCar.model = "�׷���";
		myCar.price = 30000000;
		myCar.old = true;
		myCar.speed = 60;
		
		//�ʵ��� ���� �б�
		System.out.println(myCar.company); // myCar. : myCar ��� �ϴ� ������ ������ �ִ�
		System.out.println(myCar.model);
		System.out.println(myCar.speed);
		System.out.println(myCar.old);
		System.out.println(myCar.price);
		
		// �ٸ� ��ü ����
		Car yourCar = new Car(); // ���� myCar�� �������̴�.
		
		
	}

}
