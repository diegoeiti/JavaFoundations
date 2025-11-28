package desafio;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        // Calcular o fatorial de um número.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        int resultado = 1;
        for  (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        System.out.println("O Fatorial é: " + resultado);
    }
}
