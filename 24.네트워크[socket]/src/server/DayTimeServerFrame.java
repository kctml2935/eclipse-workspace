package server;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class DayTimeServerFrame extends JFrame {
	private JPanel contentPane;
	private JTextArea displayTA;
	private JScrollPane scrollPane;
	public static void main(String[] args) {
		DayTimeServerFrame frame = new DayTimeServerFrame();
		frame.setVisible(true);
	}
	/**
	 * Create the frame.
	 */
	public DayTimeServerFrame() {
		setAlwaysOnTop(true);
		setTitle("DayTimeServer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		displayTA = new JTextArea();
		displayTA.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 16));
		displayTA.setEditable(false);
		scrollPane.setViewportView(displayTA);
		/************* 서버쓰레드시작 ******************/
		DayTimeServerThread dayTimeServerThread = new DayTimeServerThread();
		dayTimeServerThread.start();
		/*********************************************/

	}// 생성자끝
	public void displayLog(String log){
		displayTA.append(log+"\n");
	}
	
	/***************DayTimeServerThread start [inner class]******************/
	/*
	0.DayTimeServerThread:ServerSocket생성(8000)
	1.DayTimeServerThread:클라이언트연결요청대기(쓰레드대기)
	2.DayTimeServerThread:클라이언트와연결된서버쪽 소켓생성
	3.DayTimeServerThread:소켓으로부터 OutputStream생성
	4.DayTimeServerThread:소켓으로부터 생성된OutputStream에서버시간쓰기
	5.DayTimeServerThread:클라이언트와연결된서버쪽 소켓닫기
	*/
	public class DayTimeServerThread extends Thread{
		public void run() {
			try {
				displayLog("0.DayTimeServerThread:ServerSocket생성(8000)");
				ServerSocket serverSocker = new ServerSocket(8000);
				while(true) {
					displayLog("1.DayTimeServerThread:클라이언트연결요청대기(쓰레드대기)");
					Socket socket = serverSocker.accept();
					displayLog("2.DayTimeServerThread:클라이언트와연결된서버쪽 소켓생성:"+socket);
					displayLog("3.DayTimeServerThread:소켓으로부터 OutputStream생성");
					PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
					
					Date serverDate = new Date();
					
					String serverTimeStr = serverDate.toLocaleString();
					displayLog("4.DayTimeServerThread:소켓으로부터 생성된OutputStream에서버시간쓰기");
					out.println("["+socket.getLocalAddress().getHostAddress()+"]"+serverTimeStr);
					out.flush();
					socket.close();
					displayLog("5.DayTimeServerThread:클라이언트와연결된서버쪽 소켓닫기");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/*************DayTimeServerThread end [inner class]****************/
}






