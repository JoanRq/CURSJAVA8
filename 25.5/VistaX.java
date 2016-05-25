import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaX implements ActionListener {
  public static void main(String[] args) {
    VistaX v = new VistaX();
    
    JFrame marco = new JFrame("Titol de VistaX");
    marco.setSize(300,200);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JButton boto = new JButton("Boto");
    marco.add(boto);
    
    boto.addActionListener(v);
    
    
    

    
    
    marco.setVisible(true);
  }
  
  
  public void actionPerformed(ActionEvent e) {
    showMessageDialog(null,"Hola");
    
  }
  
}
