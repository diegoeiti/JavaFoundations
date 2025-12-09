import entidades.Pedido;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPedidos {
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    public GerenciadorPedidos() {
        pedidos = new ArrayList<>();
    }

    // Adicionar pedido (versão simplificada)
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    // Listar pedidos
    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido realizado.");
            return;
        }

        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println((i + 1) + " - " + pedidos.get(i));
        }
    }

    // Atualizar pedido
    public boolean atualizarPedido(int indice, int novaQuantidade) {
        if (indice >= 0 && indice < pedidos.size()) {
            pedidos.get(indice).setQuantidade(novaQuantidade);
            return true;
        }
        return false;
    }

    // Remover pedido
    public boolean removerPedido(int indice) {
        if (indice >= 0 && indice < pedidos.size()) {
            pedidos.remove(indice);
            return true;
        }
        return false;
    }

    // Calcular total geral
    public double calcularTotalGeral() {
        double total = 0;
        for (Pedido p : pedidos) {
            total += p.calcularTotal();
        }
        return total;
    }

    // Getter para a lista (se necessário)
    public List<Pedido> getPedidos() {
        return pedidos;
    }
}