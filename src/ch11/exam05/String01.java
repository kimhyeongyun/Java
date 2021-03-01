package ch11.exam05;

import java.util.Arrays;


public class String01 {

	public static void main(String[] args) throws Exception { // 이러면 누가 실행해? JVM / a.java -> (javac) a.class -> (java) JVM을 실행시킴
		// TODO Auto-generated method stub
		byte[] arr1 = {65, 66, 67};
		String str1 = new String(arr1);
		System.out.println(str1);
		
		String str2 = new String("ABC");
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2)); // Arrays.toString() 기억하기
		
		
		String str3 = "가나다";
		byte[] arr31 = str3.getBytes("EUC-KR"); // 영어와 한글만 지원 / 한글한자는 2byte로 표현 -80, -95 -> 가 
		byte[] arr32 = str3.getBytes("UTF-8"); // 전세계나라 언어 다 지원 / 대부분 인터넷에서 주고 받는 언어 / 한글한자는 3byte로 표현  -22, -80, -128 -> 가
		System.out.println(Arrays.toString(arr31));
		System.out.println(Arrays.toString(arr32)); 
		
		// 다시 한글로 복원
		String str4 = new String(arr31, "EUC-KR");
		String str5 = new String(arr32, "UTF-8");
		
		System.out.println(str4);
		System.out.println(str5);	
		
	}

}
