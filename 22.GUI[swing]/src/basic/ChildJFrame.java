package basic;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChildJFrame extends JFrame{
	
	private JPanel contentPane;
	private JButton loginButton;
	private JButton JoinButton;
	
	public ChildJFrame() {
		contentPane = new JPanel();
		this.setContentPane(contentPane);
		this.getContentPane().setBackground(Color.CYAN);
		
		this.setSize(300,400);
		
		loginButton = new JButton("로그인");
		JoinButton = new JButton("회원가입");
		contentPane.setLayout(null);
		
		loginButton.setBounds(40,160,90,40);
		JoinButton.setBounds(150,160,90,40);
		
		
		contentPane.add(loginButton);
		contentPane.add(JoinButton);
		
	}
	public static void main(String[] args) {
		ChildJFrame childJFrame = new ChildJFrame();
		childJFrame.setVisible(true);
		System.out.println("main thread end and jvm return");
		return;
	}	
}
