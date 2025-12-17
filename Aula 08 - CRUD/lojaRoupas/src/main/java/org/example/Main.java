package org.example;

import org.example.entidades.*;

import java.sql.SQLException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws SQLException {
        GerenciadorRoupas gerenciadorRoupas = new GerenciadorRoupas();
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
            }
        }

    }
}
