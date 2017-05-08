import java.awt.*;        
import java.awt.event.*; 
public class pheptoan extends Frame implements WindowListener ,ActionListener {
		   private Label lbla , lblb , lblkq ;    
		   private TextField txta , txtb , txtkq ; 
		   private Button btncong , btntru , btnnhan , btnchia ;  
		   private float cong , tru , nhan ;
		   private float chia ;
		   public pheptoan()
		   {
			   addWindowListener(this);
			   setLayout(new FlowLayout());
			   lbla = new Label("a  ");
			   add(lbla);
			   txta = new TextField ("",10);
			  
			   add(txta);
			  lblb = new Label( "b ");
			   add(lblb);
			   txtb = new TextField("",10);
			   
			   add(txtb);
			   
			   btncong = new Button("+");
			   add(btncong);
			   btncong.addActionListener(this);
			   btntru = new Button ("-");
			   add (btntru);
			   btntru.addActionListener(this);
			   btnnhan= new Button (" * ");
			   add (btnnhan);
			   btnnhan.addActionListener(this);
			   btnchia = new Button ("/");
			   add (btnchia);
			   lblkq = new Label("kq =");
			   add(lblkq );
			   txtkq = new TextField("0",10);
			   txtkq.setEditable(false);
			   add(txtkq);
			   btnchia.addActionListener(this);
			   setTitle("phep toan");
			   setSize(250,100);
			   setVisible(true); 		   
			    }
		   
		   public static  void main(String[] args) 
		   {
			   pheptoan bt1 = new pheptoan ();
			   
		   }
		   public void actionPerformed(ActionEvent evt) 
		   {
			   float number1 = Integer.parseInt(txta.getText());
			   float number2 = Integer.parseInt(txtb.getText());
			   if (evt.getSource()==btncong)
			     {
				   cong = number1 + number2 ;
				     txtkq.setText(cong +"");
			     }
			   if ( evt.getSource()==btntru)
			   {
				   tru = number1 - number2 ;
				   txtkq.setText(tru +""); 
			   } 
		    
		   if ( evt.getSource()==btnnhan)
		   {
			   nhan = number1 * number2 ;
			   txtkq.setText(nhan +""); 
		   } 
		    
		   if ( evt.getSource()==btnchia )
		   {
			   chia =  (number1 / number2) ;
			   txtkq.setText(chia + ""); 
		   } 
			     
			 
			    
			     
			   
			 
		   }

		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void windowClosed(WindowEvent arg0) {
	
			// TODO Auto-generated method stub
			
		}

		public void windowClosing(WindowEvent arg0) {
			      System.exit(0);  // Terminate the program
			   
			// TODO Auto-generated method stub
			
		}

		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		   

}
