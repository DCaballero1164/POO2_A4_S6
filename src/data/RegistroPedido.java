package data;

import model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class RegistroPedido {
    private List<Pedido> pedidos;

    public RegistroPedido() {
        pedidos = new ArrayList<>();
    }

    //Metodo que agrega un pedido
    public void AgregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    //Metodo para obtener todos los pedidos
    public List<Pedido> getPedidos() {
        return pedidos;
    }

}
