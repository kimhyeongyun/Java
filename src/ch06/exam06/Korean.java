package ch06.exam06;

public class Korean {
	
	
	//Constructor
	//Field - ��ġ�� �������. ���Ʒ� �������.
	String nation = "�ѱ�";
	String name; 
	String ssn;
	int age;
	
	Korean() {
		this("�ƹ���", "000000-0000000", 1);
	}
	
	Korean(String name) {
		this(name, "111-111", 2);
	}
	
	Korean(String name, String ssn) { 
		this(name, ssn, 1);
	}
	
	Korean(String name, String ssn, int age) {		
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
	


}
