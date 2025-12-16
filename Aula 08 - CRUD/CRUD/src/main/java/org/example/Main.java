package org.example;

import org.example.entidades.*;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();
        Aluno aluno1 = new Aluno("Diego", 10,10);

        gerenciarAlunos.alterarAluno(2, "DiegoEiti", 10, 1);
    }
}
