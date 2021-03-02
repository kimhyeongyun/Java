package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) {

		String filePath = "D:/Java/Java/src/ch18/exam01/data.txt";
		try {
			InputStream is = new FileInputStream(filePath);
			while(true) {
				int data = is.read();
				if(data == -1) {
					break;
				}
				System.out.println(data);
			}
			is.close(); // 반드시 필수 ; 만약에 close하면 다른 프로그램이 다 파일을 사용을 못해요.
			
//			int byte1 = is.read();
//			int byte2 = is.read();
//			int byte3 = is.read();
//			int byte4 = is.read();
////			System.out.println((char)byte1);
////			System.out.println((char)byte2);
////			System.out.println((char)byte3);
//			System.out.println(byte1);
//			System.out.println(byte2);
//			System.out.println(byte3);
//			System.out.println(byte4);
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
