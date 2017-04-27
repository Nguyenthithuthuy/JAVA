
import java.awt.*;        // Using AWT containers and components
import java.awt.event.*;  // Using AWT events classes and listener interfaces
 
// An AWT GUI program inherits the top-level container java.awt.Frame
public class WindowEventDemo extends Frame
      implements ActionListener, WindowListener {
     
   private TextField tfCount;
   private Button btnCount;    
   private int count = 0;      
   public WindowEventDemo() {
      setLayout(new FlowLayout()); 
 
      add(new Label("Counter"));  
 
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);      
      add(tfCount);                     
 
      btnCount = new Button("Count");  
      add(btnCount);                  
 
      btnCount.addActionListener(this);
      addWindowListener(this);
      setTitle("WindowEvent Demo"); 
      setSize(250, 100);            
      setVisible(true);             
   }
 
  
   public static void main(String[] args) {
      new WindowEventDemo();  
   }
 
   

   public void actionPerformed(ActionEvent evt) {
      ++count;
      tfCount.setText(count + "");
   }
 
  

   public void windowClosing(WindowEvent evt) {
      System.exit(0);  
   }
 
   
   public void windowOpened(WindowEvent evt) { }
   public void windowClosed(WindowEvent evt) { }
   public void windowIconified(WindowEvent evt) { }
   public void windowDeiconified(WindowEvent evt) { }
   public void windowActivated(WindowEvent evt) { }
   public void windowDeactivated(WindowEvent evt) { }
}