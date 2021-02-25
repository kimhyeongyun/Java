package ch11.exam07;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = Integer.parseInt("3"); // Integer 이게 정적 메서드 Wrapper 클래스
		double var2 = Double.parseDouble("3.5"); // Double 이게 정적 메서드 Wrapper 클래스
		
		Integer var4 = new Integer(3);   // 세 개 다 똑같음.
		Integer var5 = new Integer("3"); // 세 개 다 똑같음.
		Integer var6 = 3;                // 세 개 다 똑같음.
	}

}
