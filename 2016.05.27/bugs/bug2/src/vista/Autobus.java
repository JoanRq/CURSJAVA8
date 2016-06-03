package vista;

import controlador.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by poo2 on 25/05/2016.
 */
public class Autobus extends JFrame implements ActionListener {
  private JPanel autobus;
  private JTextField matricula;
  private JTextField plazas;
  private JButton darDeAltaAutobúsButton;
  private JTextField linea;
  private Controlador ctrl;

  public Autobus(String titulo, Controlador c) {
    super(titulo);
    setContentPane(autobus);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);

    ctrl = c;

    darDeAltaAutobúsButton.addActionListener(this);
  }

  public static void main(String[] args) {
    Autobus b = new Autobus("Autobus nuevo", new Controlador());
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    try {
      String mat = matricula.getText();
      String pla = plazas.getText();
      String lin = linea.getText();
      int npla = Integer.parseInt(pla);
      int nlin = Integer.parseInt(lin);
      ctrl.addAutobus(mat, npla, nlin);

      showMessageDialog(this, "Datos introducidos");
    } catch (Exception error) {
      showMessageDialog(this, "Error al introducir datos");
    }

  }

  {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
    $$$setupUI$$$();
  }

  /**
   * Method generated by IntelliJ IDEA GUI Designer
   * >>> IMPORTANT!! <<<
   * DO NOT edit this method OR call it in your code!
   *
   * @noinspection ALL
   */
  private void $$$setupUI$$$() {
    autobus = new JPanel();
    autobus.setLayout(new GridBagLayout());
    final JLabel label1 = new JLabel();
    label1.setText("Matrícula");
    GridBagConstraints gbc;
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 1;
    gbc.anchor = GridBagConstraints.WEST;
    autobus.add(label1, gbc);
    final JPanel spacer1 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 2;
    gbc.gridy = 1;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    autobus.add(spacer1, gbc);
    final JPanel spacer2 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 2;
    gbc.fill = GridBagConstraints.VERTICAL;
    autobus.add(spacer2, gbc);
    matricula = new JTextField();
    gbc = new GridBagConstraints();
    gbc.gridx = 3;
    gbc.gridy = 1;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipadx = 50;
    autobus.add(matricula, gbc);
    final JLabel label2 = new JLabel();
    label2.setText("Plazas");
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 3;
    gbc.anchor = GridBagConstraints.WEST;
    autobus.add(label2, gbc);
    plazas = new JTextField();
    gbc = new GridBagConstraints();
    gbc.gridx = 3;
    gbc.gridy = 3;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    autobus.add(plazas, gbc);
    final JLabel label3 = new JLabel();
    label3.setText("Línea");
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 5;
    gbc.anchor = GridBagConstraints.WEST;
    autobus.add(label3, gbc);
    final JPanel spacer3 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 4;
    gbc.fill = GridBagConstraints.VERTICAL;
    autobus.add(spacer3, gbc);
    final JPanel spacer4 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 0;
    gbc.fill = GridBagConstraints.VERTICAL;
    autobus.add(spacer4, gbc);
    final JPanel spacer5 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    autobus.add(spacer5, gbc);
    final JPanel spacer6 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 4;
    gbc.gridy = 1;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    autobus.add(spacer6, gbc);
    final JPanel spacer7 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 6;
    gbc.fill = GridBagConstraints.VERTICAL;
    autobus.add(spacer7, gbc);
    darDeAltaAutobúsButton = new JButton();
    darDeAltaAutobúsButton.setText("Dar de alta autobús");
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 7;
    gbc.gridwidth = 3;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    autobus.add(darDeAltaAutobúsButton, gbc);
    final JPanel spacer8 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 8;
    gbc.fill = GridBagConstraints.VERTICAL;
    autobus.add(spacer8, gbc);
    linea = new JTextField();
    gbc = new GridBagConstraints();
    gbc.gridx = 3;
    gbc.gridy = 5;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    autobus.add(linea, gbc);
  }

  /**
   * @noinspection ALL
   */
  public JComponent $$$getRootComponent$$$() {
    return autobus;
  }
}