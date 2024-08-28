package util;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderMain {

	public static void main(String[] args) throws Exception{
		InputStream consoleIn = System.in;
		InputStreamReader isr = new InputStreamReader(consoleIn);
		BufferedReader br = new BufferedReader(isr);
		while(true) {
		System.out.println("콘솔(키보드)로부터 데이타를읽기위해 실행흐름(쓰레드) 대기");
		System.out.println("이름을입력하세요:");
		String readLine = br.readLine();
		if(readLine.equalsIgnoreCase("x"))break;
		System.out.println(readLine);
		}
		System.out.println("프로그램종료");
	}

}
