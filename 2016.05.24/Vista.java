import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vista extends JFrame implements ActionListener {
  private JTextField texto;

  public Vista() {
    super("LA aplicación de autobuses");

    setSize(500, 600);

    // La aplicación acaba al darle a la X
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLayout(new GridLayout(2, 1));
    texto = new JTextField();
    add(texto);
    JButton boton = new JButton("HAZ CLICK");
    add(boton);
    boton.addActionListener(this);

    setVisible(true);
  }

  public static void main(String[] args) {
    Vista marco = new Vista();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println(texto.getText());
  }
}