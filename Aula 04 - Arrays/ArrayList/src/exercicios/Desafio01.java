package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        //Crie uma lista de nomes e filtre os que comecam com uma letra especifica.Depois
        // exiba quantos nomes foram encontrados.

        ArrayList<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Rodrigues");
        nomes.add("Antonio");
        nomes.add("Juanito");
        nomes.add("Diego");
        nomes.add("Amanda");

        System.out.println("Digite uma letra: ");
        String letra = sc.nextLine();

        int soma = 0;
        for (String nome : nomes){
            if(nome.charAt(0) == letra.toUpperCase().charAt(0)) {
                System.out.println(nome);
                soma++;
            }
        }

        System.out.println(soma);




    }
}
