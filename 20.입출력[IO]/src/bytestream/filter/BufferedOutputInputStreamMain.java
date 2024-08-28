package bytestream.filter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputInputStreamMain {

	public static void main(String[] args) throws Exception{
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bufferOut.dat"));
		bos.write(65);
		bos.write(66);
		bos.write(67);
		bos.write(251);
		for (int i = 0; i < 256; i++) {
			bos.write(i);
		}
		bos.close();
		System.out.println("BufferedOutputStream.write--> bufferOut.dat");
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bufferOut.dat"));
		while(true) {
			int readByte = bis.read();
			if(readByte == -1) {
				break;
			}
			System.out.println(Integer.toBinaryString(readByte));
		}
		bis.close();
		System.out.println();
		System.out.println("BufferedInputStream.read--> bufferOut.dat");
		
		
		
		
		

	}

}
