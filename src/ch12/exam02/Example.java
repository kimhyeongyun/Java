package ch12.exam02;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("���� ������ ����");
		
		// ��Ʈ��ũ �۾��� �ϴ� ������ ������ ����
		Thread thread1 = new NetworkTask();
		thread1.start();
		// ���� �۾��� �ϴ� ������ ������ ����
		Thread thread2 = new MusicTask();
		thread2.start();
		
		// ä�� �۾��� �ϴ� ������ ������ ����
		Thread thread3 = new Thread() {
			@Override
			public void run() {
				while(true) {
					
					System.out.println("ä�� �۾��� �մϴ�.");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		}; // interface�� �����ڰ� ���µ� ()�� ����¡..
		// {}��...? Runnable �̶�� Ŭ������ �����ϰ� ���� �̰��� ��ü�� ����ڵ���. -> Ŭ�����̸��� ����? �׷��� �͸�ü��� �θ�.
		thread3.start();
		
		while(true){
			System.out.println("���� �۾��� �մϴ�.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
	}

}
