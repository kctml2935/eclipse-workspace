import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import javax.swing.ImageIcon;

public class ClockFrame extends JFrame {
	
	JPanel contentPane;
	JLabel timeDisplayLB;
	private JLabel imageLB;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockFrame frame = new ClockFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClockFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 148);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		timeDisplayLB = new JLabel("12:00");
		timeDisplayLB.setFont(new Font("굴림체", Font.BOLD, 15));
		timeDisplayLB.setForeground(new Color(0, 0, 255));
		timeDisplayLB.setBounds(91, 21, 268, 69);
		contentPane.add(timeDisplayLB);
		
		imageLB = new JLabel("");
		imageLB.setIcon(new ImageIcon("C:\\2024-07-JAVA-DEVELOPER\\eclipse-workspace\\20.입출력[IO]\\sample\\subSample2\\penguin\\penguin1.gif"));
		imageLB.setBounds(12, 21, 67, 68);
		contentPane.add(imageLB);
		
		ClockThread clockThread=new ClockThread();
		clockThread.start();
		ImageThread imageThread = new ImageThread();
		imageThread.start();
		
	}//생성자끝
	
	private int imageIndex=1;
	
	/****************ClockThread[멤버클래스]****************/
	public class ClockThread extends Thread {
		@Override
		public void run() {
			while(true) {
				try {
					Date now =new Date();
					timeDisplayLB.setText(now.toLocaleString());
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	public class ImageThread extends Thread {
		@Override
		public void run() {
			while(true) {
				try {
					
					imageIndex = imageIndex%3;
					imageIndex++;
					imageLB .setIcon(new ImageIcon("C:\\2024-07-JAVA-DEVELOPER\\eclipse-workspace\\20.입출력[IO]\\sample\\subSample2\\penguin\\penguin"+imageIndex+".gif"));
					Thread.sleep(100);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}