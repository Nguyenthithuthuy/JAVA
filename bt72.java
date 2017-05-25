import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class bt72 {

	private JFrame frmTnhTinin;
	private JTextField txtCSC;
	private JTextField txtCSM;
	private JLabel lblNewLabel_3;
	private JTextField txtTongSoDien;
	private JLabel lblNewLabel_4;
	private JTextField txtThanhTien;
	private JButton bntTinh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt72 window = new bt72();
					window.frmTnhTinin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bt72() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTnhTinin = new JFrame();
		frmTnhTinin.setTitle("TÍNH TIỀN ĐIỆN ");
		frmTnhTinin.setBounds(100, 100, 450, 300);
		frmTnhTinin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTnhTinin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÍNH TIỀN ĐIỆN THEO CHỈ SỐ ĐỒNG HỒ ");
		lblNewLabel.setBounds(75, 12, 331, 15);
		frmTnhTinin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chỉ Số Cũ");
		lblNewLabel_1.setBounds(34, 52, 70, 15);
		frmTnhTinin.getContentPane().add(lblNewLabel_1);
		
		txtCSC = new JTextField();
		txtCSC.setBounds(170, 50, 166, 19);
		frmTnhTinin.getContentPane().add(txtCSC);
		txtCSC.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Chỉ Số Mới");
		lblNewLabel_2.setBounds(34, 79, 101, 15);
		frmTnhTinin.getContentPane().add(lblNewLabel_2);
		
		txtCSM = new JTextField();
		txtCSM.setBounds(170, 77, 166, 19);
		frmTnhTinin.getContentPane().add(txtCSM);
		txtCSM.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Tổng Số Điện ");
		lblNewLabel_3.setBounds(34, 124, 101, 15);
		frmTnhTinin.getContentPane().add(lblNewLabel_3);
		
		txtTongSoDien = new JTextField();
		txtTongSoDien.setEnabled(false);
		txtTongSoDien.setBounds(170, 122, 166, 19);
		frmTnhTinin.getContentPane().add(txtTongSoDien);
		txtTongSoDien.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Thành Tiền ");
		lblNewLabel_4.setBounds(34, 151, 101, 15);
		frmTnhTinin.getContentPane().add(lblNewLabel_4);
		
		txtThanhTien = new JTextField();
		txtThanhTien.setEnabled(false);
		txtThanhTien.setBounds(170, 153, 166, 19);
		frmTnhTinin.getContentPane().add(txtThanhTien);
		txtThanhTien.setColumns(10);
		
		bntTinh = new JButton("TÍNH ");
		bntTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float ChiSoMoi = Float.parseFloat(txtCSM.getText());
				float ChiSoCu = Float.parseFloat(txtCSC.getText());
				float TongSoTienDien = ChiSoMoi - ChiSoCu ;
				txtTongSoDien.setText(String.valueOf(TongSoTienDien));
				float THanhTien = 1 ;
				THanhTien=TongSoTienDien*500;
		        if(TongSoTienDien>300)
		        {
		            THanhTien+=(TongSoTienDien-300)*4000;
		            THanhTien=300;
		        }
		          if(TongSoTienDien>200)
		        {
		            THanhTien+=(TongSoTienDien-200)*2500;
		            THanhTien=200;
		        }
		            if(TongSoTienDien>100)
		        {
		            THanhTien+=(TongSoTienDien-100)*2000;
		            THanhTien=100;
		        }
		              if(TongSoTienDien>50)
		        {
		            THanhTien+=(TongSoTienDien-50)*1000;
		            THanhTien=50;
		        }
		      
		       
		        
		        txtThanhTien.setText(String.valueOf(THanhTien));
				
			}
		});
		bntTinh.setBounds(106, 182, 117, 25);
		frmTnhTinin.getContentPane().add(bntTinh);
	}

}
