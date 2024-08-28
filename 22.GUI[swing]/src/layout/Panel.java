package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;

public class Panel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel frame = new Panel();
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
	public Panel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(44, 53, 555, 323);
		panel.setBackground(new Color(0, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(65, 92, 100, 29);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(65, 164, 100, 35);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(256, 92, 163, 36);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(256, 164, 163, 38);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("로그인");
		btnNewButton_5.setBounds(127, 244, 97, 23);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("회원가입");
		btnNewButton_6.setBounds(272, 244, 97, 23);
		panel.add(btnNewButton_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 636, 56);
		panel_1.setBackground(new Color(219, 112, 147));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(61, 10, 294, 36);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.setBounds(388, 16, 97, 23);
		panel_1.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(599, 53, 37, 323);
		panel_4.setBackground(new Color(148, 0, 211));
		contentPane.add(panel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 375, 636, 33);
		panel_3.setBackground(new Color(0, 139, 139));
		contentPane.add(panel_3);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("로그인");
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("회원리스트");
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("회원삭제");
		panel_3.add(btnNewButton_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 53, 44, 323);
		contentPane.add(panel_2);
		panel_2.setBackground(new Color(153, 50, 204));
		panel_2.setLayout(null);
		
		JList list = new JList();
		list.setBounds(0, 5, 44, 103);
		panel_2.add(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"a", "bc", "zcxz"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}
}
