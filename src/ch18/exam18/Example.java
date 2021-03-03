package ch18.exam18;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String filePath1 = "D:/MyProject/Java/src/ch18/exam18/data.db";
		OutputStream os = new FileOutputStream(filePath1);
		DataOutputStream dos = new DataOutputStream(os);
		
		dos.writeInt(3); // 4 byte
		dos.writeDouble(10.5); // 8 byte
		dos.writeBoolean(true); // 1 byte
		dos.writeUTF("ȫ�浿"); // 9 byte
		dos.flush();
		
		dos.close();
	}

}
