package ch18.exam15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//폴더 밑의 파일들을 전부 다 가져오고 싶다.
		File file = new File("C:/Temp");
		
		
//		String[] list = file.list();
//		for(String name : list) {
//			System.out.println(name);
//		}
		
		File[] files = file.listFiles();
		for(File f : files){
			long time = f.lastModified();
			Date date = new Date(time);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			System.out.println(sdf.format(date));
			
			if(f.isDirectory()) {
				System.out.println("\t<dir>\t");
			} else {
				System.out.println("\t" + f.length() + "\t");
			}
			System.out.println(f.getName());
		}
	 }
		
	

}
