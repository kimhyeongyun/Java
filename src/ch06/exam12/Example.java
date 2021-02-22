package ch06.exam12;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.pi);
		Calculator.plus(3, 5);
		
		//
		Calculator myCalc = new Calculator();
		System.out.println(myCalc.pi); // 노란줄 : 경고 / 웬만해서 사용하지 말기
		myCalc.plus1(3, 5); // 노란줄 : 경고 / 웬만해서 사용하지 말기
		
	}

}
