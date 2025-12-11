package entidades;

import java.util.ArrayList;

public class ListaPedido {
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    public void adicionarPedido(Pedido pedido) {
        if (pedido.getQuantidade() <= 0) {
            System.out.println("Informe um valor maior que 0");
        } else {
            pedidos.add(pedido);
            System.out.println("Pedido adicionado com sucesso!");
        }
    }

    public void exibirPedido() {
        System.out.println("ID | LANCHE | QUANTIDADE | VALOR | VALOR TOTAL");
        for (int i  = 0; i < pedidos.size(); i++) {
            System.out.println(i + pedidos.get(i).toString());
        }
    }

    public Pedido getPedido(int i) {
        return pedidos.get(i);
    }

    public void removerPedido(int i) {
        pedidos.remove(i);
        System.out.println("Pedido removido com sucesso!");
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Pedido pedido : pedidos) {
            total += pedido.calcularTotal();
        }
        return total;
    }
}
