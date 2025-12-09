import entidades.GerenciadorPedido;
import entidades.MenuLanches;
import entidades.Pedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuLanches menuLanches = new MenuLanches();
        GerenciadorPedido gerenciadorPedido = new GerenciadorPedido();
        int opcao;

        while (true) {
            System.out.println("===== SISTEMA DE PEDIDOS =====");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Listar itens");
            System.out.println("3 - Atualizar pedido");
            System.out.println("4 - Excluir item");
            System.out.println("5 - Valor total");
            System.out.println("6 - Sair");
            System.out.println("Digite uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    menuLanches.exibirLanches();
                    System.out.println("Digite o id do lanche ");
                    int opcaoLanche = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    var lanche = menuLanches.getLanche(opcaoLanche);
                    Pedido pedido = new Pedido(lanche.getNome(), lanche.getPreco(), quantidade);
                }

            }
        }

    }
}