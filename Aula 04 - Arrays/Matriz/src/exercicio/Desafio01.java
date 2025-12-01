package exercicio;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        //Inserir 10 notas usando array e calcular a media
        Scanner sc = new Scanner(System.in);
        int[] lista_notas = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.print("Digite uma nota " + (10 - i) + " vezes:");
            int nota = sc.nextInt();
            lista_notas[i] = nota;
        }

        int soma = 0;
        for (int nota : lista_notas) {
            soma += nota;
        }

        double media = (double) soma / (double) lista_notas.length;
        System.out.println("A média das notas será: " + media + " E a soma será: " + soma);

    }
}
