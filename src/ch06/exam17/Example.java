package ch06.exam17;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		User u1 = new User();
//		u1.id = "!@#!@#";
//		u1.age == -10;
		u1.setAge(-10);
		u1.setPassword("12345");
		
		System.out.println(u1.getAge());
//		System.out.println(u1.password);
		u1.setAdult(true);
		System.out.println(u1.isAdult());
	}

}
