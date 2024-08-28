package server;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketMain {

	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket(3333);
		while(true) {
		Socket socket = serverSocket.accept();
		System.out.println("1.클라이언트 소켓연결요청을 처리한후 소켓반환");
		System.out.println("2.클라이언트와 연결된 서버쪽 소켓:"+ socket);
		System.out.println("**********Server쪽 Socket정보***********");
		InetAddress remoteAddress = socket.getInetAddress();
		int remotePort = socket.getPort();
		InetAddress localAddress = socket.getLocalAddress();
		int localPort = socket.getLocalPort();
		System.out.println("remote   ip:"+remoteAddress.getHostAddress());
		System.out.println("remote port:"+remotePort);
		System.out.println("local    ip:"+localAddress.getHostAddress());
		System.out.println("local  port:"+localPort);
		System.out.println("*************************");
		System.out.println("3.클라이언트와 연결된 모시깽");
		}
	}

}
