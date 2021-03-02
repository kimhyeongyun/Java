package ch15.exam05;

import java.io.FileReader;
import java.util.Properties;

public class Example {

	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		String path = Example.class.getResource("database.properties").getPath(); // 메모리 로딩된 주소
		prop.load(new FileReader(path)); // FileReader은 18장에서 배움
		
		String driver = prop.getProperty("driver");
		System.out.println(driver);
		
		String nation = prop.getProperty("nation");
		System.out.println(nation);
	}

}
