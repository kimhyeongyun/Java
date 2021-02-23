package ch07.exam11;

public abstract class Animal {
	public String name;
	public String kind;
	
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	public void eat() {
		System.out.println("먹습니다.");
	}
	
	// abstract class 안에는 이와같은 메서드를 가질 수 있음.
	public abstract void sound();
	
}
