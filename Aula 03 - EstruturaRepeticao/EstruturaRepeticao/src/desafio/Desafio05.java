package desafio;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        //Fazendo a sequencia de Fibonacci;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos termos da sequência Fibonacci? ");;
        int numero =  sc.nextInt();

        int primeiro = 0;
        int segundo = 1;

        System.out.println(primeiro + " " + segundo);

        for (int i = 1; i <= numero; i++) {
            int proximo = primeiro + segundo;
            System.out.println(" " + proximo);
            primeiro = segundo;
            segundo = proximo;
        }
        System.out.println();
        sc.close();

    }
}
