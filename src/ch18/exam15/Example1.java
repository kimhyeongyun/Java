package ch18.exam15;

import java.io.File;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:/Temp/dir1");
		if(file.isDirectory() ) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		
		file = new File("C:/Temp/data.txt");
		if(file.isFile()) {
			long size = file.length();
			System.out.println(size + "bytes");
		}
		
	}

}