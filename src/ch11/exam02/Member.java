package ch11.exam02;


public class Member {
	private String id;
	private String name;
	public Member(String id, String name) {
		// super(); 생략가능
		this.id = id;
		this.name = name;
	}
	
	// equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member ) { // 멤버의 클래스로 만들어졌으면
			Member m = (Member) obj;
			if(id.equals(m.id) && name.equals(m.name)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
	}
	
	
}
