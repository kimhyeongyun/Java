package ch06.exam14;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Korean.NATION = "한국";
		System.out.println(Korean.NATION);
		
		Korean k1 = new Korean("123456-1234567");
		// 여기서 딱 한번만 허용
		// k1.ssn = "666422-1234567";
		
		System.out.println(Math.PI);// 괄호가 안붙으면 static final 필드임
		double area = 10*10*Math.PI;
		
	}

}
