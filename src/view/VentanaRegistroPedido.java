package view;

import data.RegistroPedido;
import model.Pedido;

import javax.swing.*;

public class VentanaRegistroPedido extends JFrame {
    private JTextField textField1;  // ID Pedido
    private JTextField textField2;  // Dirección
    private JComboBox<String> comboBox1; // Tipo de Pedido
    private JButton guardarButton;
    private JPanel registroPanel;   // panel raíz del .form

    public VentanaRegistroPedido(RegistroPedido registro) {
        setTitle("Registro de pedido");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(registroPanel); // enlaza el panel del .form
        pack(); // ajusta tamaño según los componentes

        setLocationRelativeTo(null);    //Centrar ventana

        guardarButton.addActionListener(e -> {
            String id = textField1.getText();
            String direccion = textField2.getText();
            String tipo = (String) comboBox1.getSelectedItem();

            if (id.isEmpty() || direccion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
            } else {
                Pedido nuevoPedido = new Pedido(id, direccion, tipo);
                registro.AgregarPedido(nuevoPedido);
                JOptionPane.showMessageDialog(this, "Pedido agregado con éxito.");
                //dispose(); // cierra la ventana luego de guardar
            }
        });
    }
}
