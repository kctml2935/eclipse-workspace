package bytestream.filter;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) throws Exception{
		PrintStream consoleOut = System.out;
		PrintStream fileOut = new PrintStream(new FileOutputStream("printStream.txt"));
		String str = "프린트스트림을 공부합니다";
		double d = 3.141592;
		char c = '김';
		Object o = new Object();
		boolean isMarried = true;
		consoleOut.println(str);
		fileOut.println(str);
		consoleOut.println(d);
		fileOut.println(d);
		consoleOut.println(c);
		fileOut.println(c);
		consoleOut.println(o);
		fileOut.println(o);
		consoleOut.println(isMarried);
		fileOut.println(isMarried);
		
		consoleOut.flush();
		fileOut.flush();
		System.out.println("----------PrintStream.println()--> console,printStream.txt");
		/*
		 * consoleOut.write(65); 
		 * consoleOut.write('A'); 
		 * consoleOut.print(65);
		 * consoleOut.print('A');
		 * 
		 * consoleOut.print(isMarried); 
		 * consoleOut.print('t'); 
		 * consoleOut.print('r');
		 * consoleOut.print('u'); 
		 * consoleOut.print('e');
		 */
		
		
		
	}

}
