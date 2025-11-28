package desafio;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        //Desafio
        // Criar um programa que some 6 valores digitados pelo usuário.
        // Porem o programa so vai somar valores impares e multiplos de 3.
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();
            if (numero % 2 != 0 && numero % 3 == 0) {
                soma += numero;
            }
        }

        System.out.println(soma);
        sc.close();
    }
}
