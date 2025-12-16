package org.example;

import org.example.entidades.*;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws SQLException {
        GerenciadorRoupas gerenciadorRoupas = new GerenciadorRoupas();
        Roupa roupa1 = new Roupa("Nike", "Camiseta", "M", 5, 150);
        gerenciadorRoupas.atualizarRoupa(2, "Nike", "Blusa", "G", 10, 200);
    }
}
