package exam05;

public class Korean {
	
	
	//Constructor

	
	//Field - ��ġ�� �������. ���Ʒ� �������.
	String nation = "�ѱ�";
	String name; 
	String ssn;
	int age;
	
	Korean() {
	}
	
	Korean(String name) {		
		this.name = name;
	}
	
	Korean(String name, String ssn) {		
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String name, String ssn, int age) {		
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
	


}
