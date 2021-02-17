package ch05;

public class Exam06 {

	public static void main(String[] args) { // main method라 부름
		
		// 배열을 생성
		String[] arr1 = new String[3]; // int타입 배열 변수 arr1 선언한다. / 새로 객체를 만든다. int값이 3개가 들어갈 수 있는 배열을 만든다.
		
		// 배열 항목의 값을 읽고 출력
		for(int i=0; i < arr1.length; i++) { // .의 의미: ~에 가서 를 의미한다. arr1이 참조하는 00번지로 가서 길이를 참조하라.
			System.out.println(arr1[i]); // for문은 총 3번 반복
			
		}
		
		// 배열 항목의 값을 변경
		arr1[0] = "홍길동";
		arr1[1] = "홍자바";
		arr1[2] = "홍개발";
		
		// 배열 항목의 값을 읽고 출력
		for(int i=0; i < arr1.length; i++) { // .의 의미: ~에 가서 를 의미한다. arr1이 참조하는 00번지로 가서 길이를 참조하라.
					System.out.println(arr1[i]); // for문은 총 3번 반복
					
		}
		
		//배열 항목 비교
		System.out.println(arr1[0].equals("홍길동"));
		System.out.println(!arr1[1].equals("홍자바"));
		
	}
	
}
