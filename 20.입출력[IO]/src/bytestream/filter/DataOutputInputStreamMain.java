package bytestream.filter;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutputInputStreamMain {

	public static void main(String[] args) throws Exception{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataOut.dat"));
		int intData = 2147483647;
		dos.writeInt(intData);
		dos.writeByte(127);
		dos.writeBoolean(false);
		dos.writeDouble(3.14159);
		dos.writeChar('가');
		dos.writeUTF("오늘은자바입출력을 공부합니다");
		dos.close();
		System.out.println("DataOutputStream.writeXXX()-->dataOut.dat");
		
		DataInputStream dis = new DataInputStream(new FileInputStream("dataOut.dat"));
		int readInt = dis.readInt();
		System.out.println("int:"+readInt);
		System.out.println("byte:"+dis.readByte());
		System.out.println("Boolean:"+dis.readBoolean());
		System.out.println("Double:"+dis.readDouble());
		System.out.println("Char:"+dis.readChar());
		System.out.println("String:"+dis.readUTF());
		
		
		
	}

}
