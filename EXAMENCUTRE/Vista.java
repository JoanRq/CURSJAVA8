package vista;

import controlador.Controlador;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class Vista extends JFrame implements ActionListener {
  private JTextField textoDni;
  private JLabel etiquetaDni;

  private JTextField textoNom;
  private JLabel etiquetaNom;

  private JTextField textoAdreça;
  private JLabel etiquetaAdreça;

  private JTextField textoPaper;
  private JLabel etiquetaPaper;

  private JButton boton;

  private Controlador controlador = new Controlador();
  
  public Vista(String nomMenu) {
    super(nomMenu);
    

    setSize(500, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLayout(new GridLayout(1,2));
    textoDni     = new JTextField();
    etiquetaDni  = new JLabel("Dni: ");
    textoNom     = new JTextField();
    etiquetaNom  = new JLabel("Nom: ");
    textoAdreça     = new JTextField();
    etiquetaAdreça  = new JLabel("Adreça: ");
    textoPaper     = new JTextField();
    etiquetaPaper  = new JLabel("Paper: ");
    
    
    
    
    boton     = new JButton("D'acord");
    boton.setActionCommand("clicaAqui");
    
    add(etiquetaDni);
    add(textoDni);

    add(etiquetaNom);
    add(textoNom);
    add(etiquetaAdreça);
    add(textoAdreça);
    add(etiquetaPaper);
    add(textoPaper);

    
    
    add(boton);
    
    boton.addActionListener(this);
    pack();
    setVisible(true);
  }

  public static void main(String[] args) {
    Vista marco = new Vista("VistaDemo");
  }

  public void actionPerformed(ActionEvent e) {
    
    if ( e.getActionCommand().equals("clicaAqui") ) {
      System.out.println(" Afegim Actor");
      try {
        controlador.addActor(textoDni.getText().trim(), textoNom.getText().trim(),
            textoAdreça.getText().trim(), textoPaper.getText().trim() );
            
      } catch (Exception e1) {
        System.err.println("Error Afegint Actors"+e1.getMessage());
      }
    } 
    
  }
}