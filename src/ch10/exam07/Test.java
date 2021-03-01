package ch10.exam07;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exception();
		}	catch (Exception e) {
			System.out.println(e);
		}
	}

}
