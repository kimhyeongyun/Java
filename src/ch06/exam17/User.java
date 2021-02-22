package ch06.exam17;

public class User {
	// field
	private String id;
	private String name;
	private String password;
	private int age;
	private boolean adult;
	
	// method 하나의 필드에 게터와 세터 중 세터만 있으면 "쓰기 전용" 필드가 됨.
	// 반대로 세터는 제공안되고 게터만 제공되면 "읽기 전용" 필드가 됨.
	// Setter
//	public void setAge(int age) { // 필터링가능.
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
//	} // 비번이 나오면 안될경우
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








