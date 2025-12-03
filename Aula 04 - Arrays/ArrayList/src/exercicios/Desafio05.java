package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {

        //Desafio 05: Palavras de Comprimento Par ou Ímpar
        //
        //Solicite que o usuário insira várias palavras. Ordene-as pelo comprimento (do menor para o maior) e exiba o resultado.
        //
        //Exemplo:
        //
        //Palavras inseridas: [Java, Python, App, Aplicação]
        //
        //Palavras com comprimento par: [Python, Aplicação]
        //
        //Palavras com comprimento ímpar: [Java, App]

        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<String>();
        ArrayList<String> palavras_pares = new ArrayList<String>();
        ArrayList<String> palavras_impares = new ArrayList<String>();

        while (true) {
            System.out.println("Digite uma palavra: ");
            String palavra = sc.nextLine();
            if (palavra.length() % 2 == 0) {
                palavras_pares.add(palavra);
            } else {
                palavras_impares.add(palavra);
            }


            System.out.println("Palavras pares: " + palavras_pares);
            System.out.println("Palavras impares: " + palavras_impares);
        }
    }
}
