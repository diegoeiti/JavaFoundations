import entidades.ListaPedido;
import entidades.MenuLanches;
import entidades.Pedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuLanches menu = new MenuLanches();
        ListaPedido listaPedido = new ListaPedido();
        int opcao;

        while (true) {
            System.out.println("|||||     MENU PRINCIPAL     |||||");
            System.out.println("1 - Cadastrar lanche");
            System.out.println("2 - Listar pedido");
            System.out.println("3 - Alterar pedido");
            System.out.println("4 - Excluir pedido");
            System.out.println("5 - Calcular pedido");
            System.out.println("6 - Sair do Programa");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1 -> {
                    menu.exibirCardapio();
                    System.out.print("Digite uma opcao: ");
                    opcao = sc.nextInt();
                    sc.nextLine();


                    var LancheEscolhido = menu.getCardapio(opcao);

                    System.out.print("Digite a quantidade desejada: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    Pedido pedido = new Pedido(
                            LancheEscolhido.getNome(),
                            quantidade,
                            LancheEscolhido.getPrecoUnitario()
                    );

                    listaPedido.adicionarPedido(pedido);
                }

                case 2 -> {
                    listaPedido.exibirPedido();
                }

                case 3 -> {
                    System.out.println("Atualizar pedido");
                    listaPedido.exibirPedido();
                    System.out.println("Digite o ID do pedido:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    var pedidoEscolhido = listaPedido.getPedido(id);
                    menu.exibirCardapio();

                    System.out.println("Digite o novo lanche: ");
                    int novoLanche =  sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a nova quantidade: ");
                    int novaQuantidade = sc.nextInt();
                    sc.nextLine();

                    Pedido pedido = new Pedido()

                }


            }
        }

    }
}
