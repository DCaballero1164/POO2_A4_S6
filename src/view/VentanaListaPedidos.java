package view;

import data.RegistroPedido;
import model.Pedido;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VentanaListaPedidos extends JFrame {
    private JTable table1;
    private JPanel panel1;
    private JButton refrescarButton;

    private DefaultTableModel modelo;

    public VentanaListaPedidos(RegistroPedido registro) {
        setTitle("Lista de Pedidos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panel1); // panel raíz del .form
        pack();

        // Configurar modelo de la tabla - se utiliza DefaultTableModel
        modelo = new DefaultTableModel(new Object[]{"ID", "Dirección", "Tipo"}, 0);
        table1.setModel(modelo);

        // Acción del botón refrescar
        refrescarButton.addActionListener(e -> refrescarTabla(registro));

        // Cargar pedidos al abrir la ventana
        refrescarTabla(registro);
    }

    private void refrescarTabla(RegistroPedido registro) {
        modelo.setRowCount(0); // limpia la tabla
        for (Pedido p : registro.getPedidos()) {
            modelo.addRow(p.toArray());
        }
    }
}
