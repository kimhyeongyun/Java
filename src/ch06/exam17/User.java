package ch06.exam17;

public class User {
	// field
	private String id;
	private String name;
	private String password;
	private int age;
	private boolean adult;
	
	// method �ϳ��� �ʵ忡 ���Ϳ� ���� �� ���͸� ������ "���� ����" �ʵ尡 ��.
	// �ݴ�� ���ʹ� �����ȵǰ� ���͸� �����Ǹ� "�б� ����" �ʵ尡 ��.
	// Setter
//	public void setAge(int age) { // ���͸�����.
//		if(age < 0) {
//			this.age = 0;
//		} else {
//			this.age = age;		
//		}
//	}
//	//Getter
//	public int getAge() {
//		return age;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public boolean isAdult() {
		return adult;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public String getPassword() {
//		return password;
//	} // ����� ������ �ȵɰ��
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}








