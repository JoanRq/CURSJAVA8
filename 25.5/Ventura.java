import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ClickB1 implements ActionListener {
  public void actionPerformed(ActionEvent e){
    showMessageDialog(null, "Boton 1");
  }
}

class ClickB2 implements ActionListener {
  public void actionPerformed(ActionEvent e){
    showMessageDialog(null, "Boton 2");
  }
}

public class Ventura implements ActionListener{
  public static void main(String[] args) {
    Ventura v = new Ventura();
    JFrame marco = new JFrame("Titulo de Ventura");
    marco.setSize(300, 200);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton boton = new JButton("Botonazo");
    marco.add(boton);
    boton.addActionListener(new ClickB1());
    boton.addActionListener(new ClickB2());
    
    marco.setVisible(true);
    
  }
  
  public void actionPerformed(ActionEvent e){
    showMessageDialog(null, "Hola");
  }
}