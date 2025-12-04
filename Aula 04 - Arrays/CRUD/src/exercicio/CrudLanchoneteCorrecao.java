package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudLanchoneteCorrecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> listaValorTotal =  new ArrayList<>();
        ArrayList<Double> listaValorUnitario =  new ArrayList<>();
        ArrayList<Integer> listaQuantidade =  new ArrayList<>();
        ArrayList<String> listaPedido =  new ArrayList<>();

        int opcao;

        while (true) {
            System.out.println("===== SISTEMA DE PEDIDOS =====");
            System.out.println("1 - Fazer pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar pedido");
            System.out.println("4 - Cancelar pedido");
            System.out.println("5 - Sair");
            System.out.print("Selecione uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do pedido: ");
                    String pedido = sc.nextLine();

                    System.out.print("Informe a quantidade de lanches: ");
                    int quantidadeLanches = sc.nextInt();

                    System.out.print("Informe o valor do lanche: ");
                    double valorLanchePedido = sc.nextDouble();
                    sc.nextLine();

                    double valorTotalPedido =  valorLanchePedido * quantidadeLanches;

                    listaPedido.add(pedido);
                    listaValorUnitario.add(valorLanchePedido);
                    listaQuantidade.add(quantidadeLanches);
                    listaValorTotal.add(valorTotalPedido);

                    System.out.println("Pedido realizado com sucesso");
                    break;

                case 2:
                    System.out.println("\n----- Listar Pedidos -----");

                    if (listaPedido.isEmpty()) {
                        System.out.println("Nenhum pedido foi encontrado.");
                    } else {
                        for (int i = 0; i < listaPedido.size(); i++) {
                            System.out.println(i + "Lanche: " + listaPedido.get(i)+
                                                "Quantidade: " +  listaQuantidade.get(i) +
                                                "Valor Unitario: " + listaValorUnitario.get(i) +
                                                "Valor Total: " + listaValorTotal.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n----- Atualizar Pedido -----");
                    System.out.println("Informe o nome do pedido: ");
                    int pedidoNumero = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Informe o nome do pedido: ");
                    String novoPedido = sc.nextLine();

                    System.out.print("Informe a quantidade de lanches: ");
                    int novaQuantidadeLanches = sc.nextInt();

                    System.out.print("Informe o valor do lanche: ");
                    double novoValorLanchePedido = sc.nextDouble();
                    sc.nextLine();

                    double novoValorTotalPedido =  novoValorLanchePedido * novaQuantidadeLanches;

                    listaPedido.set(pedidoNumero, novoPedido);
                    listaValorUnitario.set(pedidoNumero, novoValorLanchePedido);
                    listaQuantidade.set(pedidoNumero, novaQuantidadeLanches);
                    listaValorTotal.set(pedidoNumero, novoValorTotalPedido);

                    System.out.println("Pedido atualizado com sucesso");
                    break;

                case 4:
                    System.out.println("----- Remover Pedidos ------");
                    System.out.println("Informe o ID do pedido: ");
                    int numeroPedido = sc.nextInt();
                    sc.nextLine();

                    listaQuantidade.remove(numeroPedido);
                    listaValorUnitario.remove(numeroPedido);
                    listaValorTotal.remove(numeroPedido);
                    listaPedido.remove(numeroPedido);
                    break;

                case 5:
                    System.out.println("Programa finalizado");
                    return;







            }

        }

    }
}
