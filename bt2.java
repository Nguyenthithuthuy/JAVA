import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class bt2 {

	private JFrame frame;
	private JTextField txtsoluong;
	private JTextField txtdongia;
	private JTextField txttinhtien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt2 window = new bt2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bt2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("Tính GIá Trị Hóa Đơn ");
		lbl1.setBounds(148, 24, 200, 15);
		frame.getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("Số lượng ");
		lbl2.setBounds(50, 60, 100, 15);
		frame.getContentPane().add(lbl2);
		
		txtsoluong = new JTextField();
		txtsoluong.setBounds(200, 58, 114, 19);
		frame.getContentPane().add(txtsoluong);
		txtsoluong.setColumns(10);
		
		JLabel lbl3 = new JLabel("Đơn giá");
		lbl3.setBounds(50, 103, 100, 15);
		frame.getContentPane().add(lbl3);
		
		txtdongia = new JTextField();
		txtdongia.setBounds(200, 101, 114, 19);
		frame.getContentPane().add(txtdongia);
		txtdongia.setColumns(10);
		
		JLabel lbl4 = new JLabel("TÍnh Tiền ");
		lbl4.setBounds(50, 149, 70, 15);
		frame.getContentPane().add(lbl4);
		
		txttinhtien = new JTextField();
		txttinhtien.setEnabled(false);
		txttinhtien.setBounds(200, 147, 114, 19);
		frame.getContentPane().add(txttinhtien);
		txttinhtien.setColumns(10);
		
		JButton bnttinhtien = new JButton("Tính Tiền ");
		bnttinhtien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(txtsoluong.getText());
				int b = Integer.parseInt(txtdongia.getText());
				int c = 0;
				c = a*b;
				txttinhtien.setText(String.valueOf(c));
		
			}
		});
		bnttinhtien.setBounds(123, 196, 117, 40);
		frame.getContentPane().add(bnttinhtien);
		
		JLabel lbl5 = new JLabel("VND");
		lbl5.setBounds(348, 103, 70, 15);
		frame.getContentPane().add(lbl5);
		
		JLabel lbl6 = new JLabel("VND");
		lbl6.setBounds(348, 149, 70, 15);
		frame.getContentPane().add(lbl6);
	}

}
