package ch18.exam05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "D:/Java/Java/src/ch18/exam05/data.txt";
		try {
			OutputStream os = new FileOutputStream(filePath);
			byte[] arr = {65, 66, 67};
			os.write(arr); // 이렇게되면 한방에 집어넣을 수 있음.
			os.write(arr, 0, arr.length); // 이렇게도 쓸 수 있음.
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
