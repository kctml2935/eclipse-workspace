package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args)throws Exception {
		
		FileInputStream fis=new FileInputStream("D2Coding-Ver1.3.2-20180524.zip");
		FileOutputStream fos=new FileOutputStream("D2Coding-Ver1.3.2-20180524_copy.zip");
		
		int byteCount=0;
		int starCount=0;
		/*
		 the difference, measured in milliseconds, betweenthe current time and midnight, January 1, 1970 
		 */
		long copyStartTime = System.currentTimeMillis();
		
		while(true) {
			int readByte = fis.read();
			if(readByte==-1)break;
			byteCount++;
			if(byteCount%1024==0) {
				System.out.print("*");
				starCount++;
				if(starCount%40==0) {
					System.out.println();
				}
			}
			fos.write(readByte);
		}
		long copyEndTime = System.currentTimeMillis();
		long duration=copyEndTime-copyStartTime;
		fis.close();
		fos.close();
		System.out.println();
		System.out.println("FileCopy:"+byteCount+ " bytes copy");
		System.out.println("took "+ duration/1000.0 + "s");
	}

}