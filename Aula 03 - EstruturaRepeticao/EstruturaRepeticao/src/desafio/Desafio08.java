package desafio;

import java.util.Scanner;

public class Desafio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        int fatorial = 1;

        if (numero < 0){
            System.out.println("Não existe fatorial para números negativos.");
        } else {
            for (int i = 1; i <= numero; i++){
                fatorial =  fatorial * i;
            }
        }

        System.out.println("O fatorial de " + numero + " é:" + fatorial);

        sc.close();
    }
}
