package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudAvancado {
    public static void main(String[] args) {
        ArrayList<String> nomesAlunos = new ArrayList<>();
        ArrayList<Double> notasAlunos = new ArrayList<>();
        ArrayList<Integer> idadeAlunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        while(true){
            System.out.println("\nSistema CRUD de Alunos");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Atualizar informações do Aluno");
            System.out.println("4. Excluir Aluno");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                //Cadastrar aluno.
                case 1:
                    System.out.println("Nome do aluno: ");
                    String nomeAluno = sc.nextLine();

                    System.out.println("Nota do aluno: ");
                    double notaAluno = sc.nextDouble();

                    System.out.println("Idade do aluno: ");
                    int idadeAluno = sc.nextInt();

                    nomesAlunos.add(nomeAluno);
                    notasAlunos.add(notaAluno);
                    idadeAlunos.add(idadeAluno);
                    System.out.println("Cadastro realizado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nLista de Alunos");
                    for (int i = 0; i < nomesAlunos.size(); i++) {
                        System.out.println("ID: " + i + " \nNome: " + nomesAlunos.get(i) +
                                                " \nIdade: " + idadeAlunos.get(i) +
                                                " \nNota: " + notasAlunos.get(i)
                        );
                    } break;

                case 3:
                    System.out.println("\nAtualizar Cadastro");
                    System.out.println("Informe o ID do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nome do aluno: ");
                    String novoNomeAluno = sc.nextLine();
                    sc.nextLine();

                    System.out.println("Nota do aluno: ");
                    double novaNotaAluno = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Idade do aluno: ");
                    int NovaIdadeAluno = sc.nextInt();

                    nomesAlunos.set(idAluno, novoNomeAluno);
                    notasAlunos.set(idAluno, novaNotaAluno);
                    idadeAlunos.set(idAluno, NovaIdadeAluno);

                    System.out.println("Atualizado com sucesso!");

                case 4:
                    System.out.println("\n Excluir Aluno");
                    System.out.println("Informe o ID do aluno: ");
                    int idRemover = sc.nextInt();
                    sc.nextLine();
                    nomesAlunos.remove(idRemover);
                    notasAlunos.remove(idRemover);
                    idadeAlunos.remove(idRemover);
                    break;
                case 5:
                    System.out.println("Programa Encerrado");
                    return;
                    
            }
        }
    }
}
