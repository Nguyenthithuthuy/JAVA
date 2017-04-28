import java.awt.*;
import java.awt.event.*;
 
// An AWT GUI program inherits from the top-level container java.awt.Frame
public class AWTCounterNamedInnerClass extends Frame {
   
   private TextField tfCount;
   private Button btnCount;
   private int count = 0;
 
   public AWTCounterNamedInnerClass () {
      setLayout(new FlowLayout());  
      add(new Label("Counter"));   
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);   
      add(tfCount);                
 
      btnCount = new Button("Count");
      add(btnCount);              
 
      
      btnCount.addActionListener(new BtnCountListener());
 
      setTitle("AWT Counter");
      setSize(250, 100);
      setVisible(true);
   }
 
   // The entry main method
   public static void main(String[] args) {
      new AWTCounterNamedInnerClass(); // Let the constructor do the job
   }
 
   private class BtnCountListener implements ActionListener {
     
      public void actionPerformed(ActionEvent evt) {
         ++count;
         tfCount.setText(count + "");
      }
   }
}