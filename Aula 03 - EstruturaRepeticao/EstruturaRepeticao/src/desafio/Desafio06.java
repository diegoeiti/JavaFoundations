package desafio;

import java.util.Scanner;

public class Desafio06 {
    public static  void main(String[] args) {
        // Faça um programa que some os numeros inteiros dele: ex: 123 = 6
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = sc.nextInt();
        int soma = 0;
        int casa = 1;
        int digito = 0;

        while (numero > 0) {
            digito = (int) (numero % Math.pow(10,casa));
            numero -= digito;
            digito = (int) (digito / Math.pow(10,casa-1));
            soma += digito;
            casa++;
        }
        System.out.println("A soma é igual a: " + soma);




        sc.close();
    }
}
