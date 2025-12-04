package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudLanchoneteAvancado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lanches = {"X-Salada", "X-Burguer", "X-BACON", "X-Egg", "X-Tudo"};
        double[] precos = {19.0, 14.0, 18.0, 15.5, 25.0};
        ArrayList<String[]> pedidos = new ArrayList<String[]>();


        while (true) {
            System.out.println("===== SISTEMA DE PEDIDOS =====");
            System.out.println("1 - Fazer pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar pedido");
            System.out.println("4 - Cancelar pedido");
            System.out.println("5 - Sair");
            System.out.println("Selecione uma opcao: ");
            int opcao = sc.nextInt();

            if  (opcao == 5) {
                break;
            }

            switch (opcao) {
                case 1:
                    for (int i = 0; i < lanches.length; i++) {
                        System.out.println(i + ": " + lanches[i]);
                    }
                    System.out.println("Escolha um lanche: ");
                    int lancheUsuario = sc.nextInt();

                    if (lancheUsuario >= 0 && lancheUsuario < lanches.length) {
                        System.out.println("Quantos lanches você deseja?");
                        int quantidade =  sc.nextInt();

                        String[] pedido = new String[3];
                        pedido[0] = lanches[lancheUsuario];
                        pedido[1] = Integer.toString(quantidade);
                        pedido[2] = Double.toString(precos[lancheUsuario] * quantidade);

                        //Adiciona o pedido a lista pedidos
                        pedidos.add(pedido);
                        System.out.printf("Pedido registrado com sucesso! %s x%d | Total: R$ %.2f\n",  lanches[lancheUsuario], quantidade, precos[lancheUsuario] * quantidade);
                    } else {
                        System.out.println("Opção inválida");
                    } break;

                case 2:
                    if (pedidos.isEmpty()) {
                        System.out.println("Nenhum pedido cadastrado!");
                    } else {
                        for (int i = 0; i < pedidos.size(); i++) {
                            String[] pedido = pedidos.get(i);
                            System.out.printf("ID: %d - %s x%s | Total: R$ %s\n", i, pedido[0], pedido[1], pedido[2]);
                        }
                    } break;

                case 3:
                    if (pedidos.isEmpty()) {
                        System.out.println("Nenhum pedido cadastrado!");
                    return; }

                System.out.println("\n----- Atualizar Pedido -----");


            }
        }
    }
}
