
import java.awt.*;
import java.awt.event.*;
 
public class MouseEventDemo extends Frame implements MouseListener {
   private TextField tfMouseX; 
   private TextField tfMouseY; 
   public MouseEventDemo() {
      setLayout(new FlowLayout()); 
      add(new Label("X-Click: "));
      tfMouseX = new TextField(10); 
      tfMouseX.setEditable(false); 
      add(tfMouseX);              
      add(new Label("Y-Click: "));
      tfMouseY = new TextField(10);
      tfMouseY.setEditable(false); 
      add(tfMouseY);                
      addMouseListener(this);
      setTitle("MouseEvent Demo"); 
      setSize(350, 100);           

      setVisible(true);            
   }
 
   public static void main(String[] args) {
      new MouseEventDemo();  
   }
 
   }