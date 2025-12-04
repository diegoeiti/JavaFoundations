package exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CrudLanchoneteCorrecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> lanches = new ArrayList<>(Arrays.asList(
                "X-Burger",
                "X-Egg",
                "X-Bacon",
                "X-Salada",
                "X-Tudo"
        ));

        ArrayList<Double> menuPrecos = new ArrayList<>(Arrays.asList(
                22.9,
                24.9,
                26.9,
                26.9,
                29.9
        ));

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

                    System.out.println("-----Cardápio-----");
                    for (int i = 0; i<lanches.size();i++) {
                        System.out.println(i + " - " + lanches.get(i) +  " - " + menuPrecos.get(i));
                    }

                    System.out.println("Informe o número do lanche");
                    int indiceLanche =  sc.nextInt();
                    sc.nextLine();

                    String pedido = lanches.get(indiceLanche);

                    System.out.print("Informe a quantidade de lanches: ");
                    int quantidadeLanches = sc.nextInt();

                    double valorLanchePedido = menuPrecos.get(indiceLanche);
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
                            System.out.println("ID: " + i + " | Lanche: " + listaPedido.get(i)+
                                                " | Quantidade: " +  listaQuantidade.get(i) +
                                                " | Valor Unitario: " + listaValorUnitario.get(i) +
                                                " | Valor Total: " + listaValorTotal.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n----- Atualizar Pedido -----");
                    System.out.println("Informe o ID do pedido: ");
                    int pedidoNumero = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i<lanches.size();i++) {
                        System.out.println(i + " - " + lanches.get(i) +  " - " + menuPrecos.get(i));
                    }

                    System.out.print("Informe o lanche do novo pedido: ");
                    int novoLanche = sc.nextInt();

                    System.out.print("Informe a nova quantidade de lanches: ");
                    int novaQuantidadeLanches = sc.nextInt();

                    double novoValorLanche = menuPrecos.get(novoLanche);
                    sc.nextLine();

                    double novoValorTotalPedido =  novoValorLanche * novaQuantidadeLanches;

                    listaPedido.set(pedidoNumero, lanches.get(novoLanche));
                    listaValorUnitario.set(pedidoNumero, menuPrecos.get(novoLanche));
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
