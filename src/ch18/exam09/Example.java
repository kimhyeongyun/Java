package ch18.exam09;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "D:/MyProject/Java/src/ch18/exam09/data.txt";
		try {
			Writer writer= new FileWriter(filePath);
			writer.write(new char[] {'A', '��'});
				
			writer.write(new char[] {'B', '��', 'C', 'D'}, 0, 2); // �˾Ƶα�
			writer.write("������ ������ ȭâ�մϴ�.");
			writer.flush();
			
			writer.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}