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



                    }
                }
            }

        }
    }
