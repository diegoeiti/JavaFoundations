package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudLanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> lanches = new ArrayList();
        ArrayList <String> pedidos = new ArrayList();

        System.out.println("Bem Vindo a lanchonete do Diego");
        lanches.add(" X-Salada");
        lanches.add(" X-Burguer");
        lanches.add(" X-Egg");
        lanches.add(" X-Tudo");

        while(true){
            System.out.println("===== SISTEMA DE PEDIDOS =====");
            System.out.println("1 - Fazer pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar pedido");
            System.out.println("4 - Cancelar pedido");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            if (opcao == 5){
                System.out.println("Finalizando o programa...");
                break;
            }

            switch (opcao){
                case 1:
                    System.out.println("\nEscolha um lanche: ");
                    for (int i = 0; i < lanches.size(); i++) {
                        System.out.println(i + lanches.get(i));
                    }

                    System.out.print("Escolha uma opcao: ");
                    opcao = sc.nextInt();

                    if  (opcao == 0){
                        pedidos.add("X-Salada");
                    } else if (opcao == 1){
                        pedidos.add("X-Burguer");
                    } else if (opcao == 2){
                        pedidos.add("X-Egg");
                    } else if (opcao == 3){
                        pedidos.add("X-Tudo");
                    }
                    System.out.println("Pedido realizado com sucesso!");
                    break;

                case 2:
                    if (pedidos.isEmpty()){
                        System.out.println("Nenhum pedido encontrado!");
                    } else {
                        System.out.println("Pedidos realizados: ");
                        for (int i = 0; i < pedidos.size(); i++) {
                            System.out.println(i + " " + pedidos.get(i));
                        }
                        } break;

                case 3:
                    System.out.println("-----Atualizar Pedido-----");
                    System.out.println("Digite o ID do pedido:");
                    int idPedido = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o novo lanche que deseja: ");
                    int novoLanche = sc.nextInt();


                    if  (novoLanche == 0){
                        pedidos.set(idPedido, "X-Salada");
                    } else if (novoLanche == 1){
                        pedidos.set(idPedido, "X-Burguer");
                    } else if (novoLanche == 2){
                        pedidos.set(idPedido, "X-Egg");
                    } else if (novoLanche == 3){
                        pedidos.set(idPedido, "X-Tudo");
                    }

                    System.out.println("Pedido atualizado com sucesso!");

                case 4:
                    System.out.println("\n-----Cancelar Pedido-----");
                    System.out.println("Digite o ID do pedido que deseja cancelar: ");
                    int IDpedido = sc.nextInt();

                    pedidos.remove(IDpedido);
                    System.out.println("Pedido cancelado com sucesso");
            }








        }
    }
}
