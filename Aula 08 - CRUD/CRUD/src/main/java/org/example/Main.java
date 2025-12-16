package org.example;

import org.example.entidades.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            GerenciarAlunos ga = new GerenciarAlunos();
            Scanner sc = new Scanner(System.in);
            int opcao;

            while (true) {
                System.out.println("-----MENU OPCOES-----");
                System.out.println("1 - Cadastrar Alunos");
                System.out.println("2 - Listar Alunos");
                System.out.println("3 - Editar Aluno");
                System.out.println("4 - Excluir Aluno");
                System.out.println("5 - Sair");
                System.out.println("Escolha uma opcao: ");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1 -> {
                        System.out.println("Digite o nome do aluno: ");
                        String nome = sc.nextLine();
                        sc.nextLine();

                        System.out.println("Digite a nota do aluno: ");
                        double nota = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Digite a nota 2 do aluno: ");
                        double nota2 = sc.nextDouble();
                        sc.nextLine();

                        Aluno aluno = new Aluno(nome, nota, nota2);
                        ga.cadastroAluno(aluno);
                    }
                    case 2 -> {
                        ga.listarAlunos();
                    }
                    case 3 -> {
                        ga.listarAlunos();
                        System.out.println("Digite o id do aluno que deseja atualizar: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Digite o novo nome: ");
                        String nome = sc.nextLine();
                        sc.nextLine();

                        System.out.println("Digite a nova nota: ");
                        double nota = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Digite a nova nota 2: ");
                        double nota2 = sc.nextDouble();
                        sc.nextLine();

                        ga.alterarAluno(id, nome, nota, nota2);
                    }
                    case 4 -> {
                        ga.listarAlunos();
                        System.out.println("Digite o id do aluno que deseja excluir: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        ga.excluirAluno(id);
                    }
                    case 5 -> {
                        System.out.println("Saindo do programa...");
                        return;
                    }
                }
            }

        }
    }
