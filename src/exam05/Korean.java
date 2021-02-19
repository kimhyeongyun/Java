package exam05;

public class Korean {
	
	
	//Constructor

	
	//Field - 위치가 상관없음. 위아래 상관없음.
	String nation = "한국";
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
