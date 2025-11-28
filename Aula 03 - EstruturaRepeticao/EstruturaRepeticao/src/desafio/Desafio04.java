package desafio;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        //Peça ao usuário números até que ele digite 0. Calcule e exiba a média dos números digitados.
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

        while (true) {

            System.out.println("Digite um número:  (digite 0 para encerrar)");

            int num =  sc.nextInt();
            if (num == 0) {
                break;
            }
            soma += num;
            contador++;

            }

            if (contador > 1) {
                double media =  soma / contador;
                System.out.println("O média dos números somados é: " + media);
            }

        sc.close();

        }
    }

