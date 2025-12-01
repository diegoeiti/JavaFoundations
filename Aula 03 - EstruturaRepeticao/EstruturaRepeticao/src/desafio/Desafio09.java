package desafio;

import java.util.Scanner;

public class Desafio09 {
    public static void main(String[] args) {
        //receba valores, se for par some com par, se for impar some com immpar
        Scanner sc = new Scanner(System.in);

        int somaPar = 0;
        int somaImpar = 0;

        while (true) {
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();

            int resto = numero % 2;

            if (numero == 0){
                break;
            }

            if (resto == 0){
                somaPar += numero;
            } else {
                somaImpar += numero;
            }

        }
        System.out.println("A soma dos números pares é igual a: " + somaPar + "\n E a soma dos números impares é igual a: " + somaImpar );
    }
}
