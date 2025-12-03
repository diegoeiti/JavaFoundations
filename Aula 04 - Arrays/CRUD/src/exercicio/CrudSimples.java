package exercicio;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class CrudSimples {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        while(true){
            System.out.println("Sistema CRUD de Alunos");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Atualizar informações do Aluno");
            System.out.println("4. Excluir Aluno");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Nome do aluno: ");
                    String nome = sc.next();
                    nomes.add(nome);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("\n -----Listar Alunos-----");

                    if(nomes.isEmpty()){
                        System.out.println("Nenhum aluno encontrado!");
                    }
                    else{
                        for(String aluno : nomes){
                            System.out.println(nomes.indexOf(aluno) +  ": " + aluno);
                            System.out.println("----------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n -----Atualizando aluno-----");
                    System.out.println("Informe o ID do aluno: ");
                    int id = sc.nextInt();
                    System.out.println("Informe a data do aluno: ");
                    String novoAluno = sc.nextLine();
                    nomes.set(id, novoAluno);

                case 4:
                    System.out.println("\n -----Excluir aluno-----");
                    System.out.println("Informe o ID do aluno: ");
                    int idAluno = sc.nextInt();
                    nomes.remove(idAluno);
                    break;

            }

            if (opcao == 0){
                System.out.println("Encerrando o programa...");
                break;
            }
        }
    }
}
