import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class NotRuntimeExceptionCatchMain {

	public static void main(String[] args)  {
		try {
			System.out.println("stmt1");
			/*
			 * 예외발생예상코드(IOException)
			 */
			Socket socket=new Socket("www.daum.net",80);
			System.out.println(socket);
			
			System.out.println("stmt2");
			/*
			 * 예외발생예상코드(ClassNotFoundException)
			 */
			Class bClass = Class.forName("BClass"); 
			System.out.println(bClass);
			
			/*
			 * 예외발생예상코드(ArithmaticException[RuntimeException])
			 */
			int result = 3/(int)(Math.random()*2);
			System.out.println(result);
			System.out.println("stmt3");
		
		}catch(UnknownHostException e) {
			System.err.println("\t catch UnknownHostException:"+e.getMessage());
			try {
				Socket socket = new Socket("www.daum.net",80);
				System.out.println("\t catch:"+socket);
			}catch (Exception e1) {
				System.out.println("catch-->catch Exception:"+e1.getMessage());
			} 
		}catch (IOException e) {
			
			System.err.println("catch IOException:"+e.getMessage());
			
		}catch (ClassNotFoundException e) {
			
			System.err.println("catch ClassNotFoundException:"+e.getMessage());
			try {
				Class aClass = Class.forName("AClass");
				System.out.println("catch : "+aClass);
				}catch(ClassNotFoundException e1) {
					System.out.println("catch --> catch:"+e1.getMessage());
			}
		}catch (Exception e) {
			System.err.println("catch Exception:"+e.getMessage());
		}
		
		System.out.println("메인실행흐름 JVM return");
		return;
	}

}
