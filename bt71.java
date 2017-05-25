import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class bt71 {

	private JFrame frmHnhTrn;
	private JTextField txtBanKinh;
	private JTextField txtChuVi;
	private JTextField txtDienTich;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt71 window = new bt71();
					window.frmHnhTrn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bt71() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHnhTrn = new JFrame();
		frmHnhTrn.setTitle("HÌNH TRÒN");
		frmHnhTrn.setBounds(100, 100, 404, 300);
		frmHnhTrn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHnhTrn.getContentPane().setLayout(null);
		
		JLabel lblTnhChuVi = new JLabel("TÍNH CHU VI VÀ DIỆN TÍCH HÌNH TRÒN ");
		lblTnhChuVi.setBounds(79, 28, 267, 15);
		frmHnhTrn.getContentPane().add(lblTnhChuVi);
		
		JLabel lblBnKnh = new JLabel("Bán Kính");
		lblBnKnh.setBounds(41, 55, 97, 15);
		frmHnhTrn.getContentPane().add(lblBnKnh);
		
		txtBanKinh = new JTextField();
		txtBanKinh.setBounds(172, 53, 114, 19);
		frmHnhTrn.getContentPane().add(txtBanKinh);
		txtBanKinh.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Chu Vi");
		lblNewLabel.setBounds(41, 98, 70, 15);
		frmHnhTrn.getContentPane().add(lblNewLabel);
		
		txtChuVi = new JTextField();
		txtChuVi.setBounds(172, 96, 114, 19);
		frmHnhTrn.getContentPane().add(txtChuVi);
		txtChuVi.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Diện Tích");
		lblNewLabel_1.setBounds(41, 139, 70, 15);
		frmHnhTrn.getContentPane().add(lblNewLabel_1);
		
		txtDienTich = new JTextField();
		txtDienTich.setBounds(172, 137, 114, 19);
		frmHnhTrn.getContentPane().add(txtDienTich);
		txtDienTich.setColumns(10);
		
		JButton btnTnh = new JButton("TÍNH");
		btnTnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float  R = Float.parseFloat(txtBanKinh.getText());
				float c = 1;
				c = (float) (Math.PI*R*2);
				txtChuVi.setText(String.valueOf(c));
				float S = 1 ;
				S = (float)(Math.PI*R*R);
				txtDienTich.setText(String.valueOf(S));
				
				
				
				
				
			}
		});
		btnTnh.setBounds(143, 184, 117, 25);
		frmHnhTrn.getContentPane().add(btnTnh);
	}
}
