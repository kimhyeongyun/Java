package ch07.exam04;

public class HomeActivity extends Activity {
	// �ʵ�
	
	// ������
	public HomeActivity() {
		super();
	}
	// �޼���
	
	
	@Override
	public void onCreate() {
		super.onCreate(); // �θ� �ִ� �ڵ带 ������.
		System.out.println("�ڽ��� UI ��Ҹ� �����մϴ�.");
		System.out.println("�ڽ��� UI ����� �̺�Ʈ�� ó���մϴ�.");
	}
}
