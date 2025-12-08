import entidades.Aluno;
import entidades.GerenciarAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();

        int opcao;

        while (true) {
            System.out.println("MENU DE OPCOES");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Consultar Alunos");
            System.out.println("3 - Atualizar Aluno");
            System.out.println("4 - Excluir Aluno");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1 -> {
                    System.out.println("Digite o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite a nota do aluno: ");
                    double nota = sc.nextInt();


                    System.out.println("Digite a nota2 do aluno: ");
                    double nota2 = sc.nextInt();

                    Aluno aluno = new Aluno(nome, nota, nota2);
                    gerenciarAlunos.adicionarAluno(aluno);

                }

            }
        }

        sc.close();
    }
}
