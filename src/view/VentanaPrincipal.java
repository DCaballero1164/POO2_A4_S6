package view;

import data.RegistroPedido;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private JButton registrarPedidoButton;
    private JButton listarPedidosButton;
    private JButton asignarRepartidorIniciarEntregaButton;
    private JPanel mainPanel; // este panel lo genera el .form

    private RegistroPedido registro;

    public VentanaPrincipal(RegistroPedido registro) {
        this.registro = registro;

        setTitle("SpeedFast - Registro de Pedidos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel); // enlaza el panel del .form
        pack(); // ajusta el tamaño según los componentes

        // Acciones de los botones
        registrarPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaRegistroPedido(registro).setVisible(true);
            }
        });

        listarPedidosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaListaPedidos(registro).setVisible(true);
            }
        });

        asignarRepartidorIniciarEntregaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(VentanaPrincipal.this,
                        "Modulo de entregas en construcción.");
            }
        });
    }
}

