package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        //Desafio 04: Remove Palavras que Contêm um Caracter Específico
        //
        //Crie uma lista de palavras e remova todas que contêm uma letra específica fornecida pelo usuário.
        //
        //Exemplo:
        //
        //Palavras originais: [Banana, Maçã, Abacate, Manga]
        //
        //Removendo palavras que contêm “a": []

        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("banana");
        frutas.add("apple");
        frutas.add("orange");
        frutas.add("pear");
        frutas.add("grape");
        frutas.add("lemon");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra =  sc.nextLine();


        ArrayList<String> frutasFiltradas = new ArrayList<String>();

        for (String fruta : frutas) {
            if (!fruta.contains(letra)) {
                frutasFiltradas.add(fruta);
            }
        }

        //Da pra resolver usando removeIf ex:
        //frutas.removeIf(fruta -> fruta.toUpperCase().contains(letra));

        System.out.println("Frutas: " + frutasFiltradas);




    }
}
