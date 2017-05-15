import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class t {

	private JFrame b;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txtkq;
	private Label lbla;
	private Label lblb;
	private Label lblkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					t window = new t();
					window.b.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public t() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		b = new JFrame();
		b.setTitle("Tính Tổng 2 số nguyên ");
		b.setBounds(100, 100, 450, 300);
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.getContentPane().setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(253, 60, 114, 19);
		b.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(253, 90, 114, 19);
		b.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		txtkq = new JTextField();
		txtkq.setEnabled(false);
		txtkq.setText("hiển thị kết quả ");
		txtkq.setBounds(253, 121, 114, 19);
		b.getContentPane().add(txtkq);
		txtkq.setColumns(10);
		
		Button bnttong = new Button("Tổng ");
		bnttong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(txt1.getText());
				int b = Integer.parseInt(txt2.getText());
				int kq = 0 ;
				kq = a + b ;
				txtkq.setText(String.valueOf(kq));
				
				
				
				
			}
		});
		bnttong.setBounds(170, 147, 86, 23);
		b.getContentPane().add(bnttong);
		
		
		Label lbl = new Label("Tính tổng 2 số nguyên ");
		lbl.setBounds(120, 28, 150, 20);
		b.getContentPane().add(lbl);
		
		lbla = new Label("Nhập số a =");
		lbla.setBounds(59, 60, 90, 21);
		b.getContentPane().add(lbla);
		
		lblb = new Label("Nhập số b =");
		lblb.setBounds(59, 90, 90, 21);
		b.getContentPane().add(lblb);
		
		lblkq = new Label("Kết Quả ");
		lblkq.setBounds(59, 120, 90, 21);
		b.getContentPane().add(lblkq);
	}
}
