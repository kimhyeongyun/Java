package ch18.exam16;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws Exception {
		

		
		// 이 부분들을 계속 반복해야함.
//		InputStream is = System.in;
//		byte[] data = new byte[100];
//		
//		int readNum = is.read(data);
//		String str = new String(data, 0, readNum -2);
//		System.out.println(str);
		
		// 방법2 : 보조스트림 사용
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is); // 바이트를 문자로 바꿔주는 보조스트림
		BufferedReader br = new BufferedReader(isr); // 보통 이 보조스트림도 같이 씀
		
		String str = br.readLine();
		System.out.println(str);
		
		str = br.readLine(); // 한번 더 읽고 싶을때
		System.out.println(str);
		
	}

}
