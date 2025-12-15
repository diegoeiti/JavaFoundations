package org.example;

import org.example.entidades.GerenciadorRoupas;
import org.example.entidades.Roupa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        GerenciadorRoupas gerenciadorRoupas = new GerenciadorRoupas();
        Roupa roupa1 = new Roupa("Nike", "Camiseta", "M", 5, 150);
        gerenciadorRoupas.cadastrarRoupa(roupa1);
    }
}
