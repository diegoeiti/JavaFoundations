package exercicio;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notas = new int[5];


        notas[0] = 5;
        notas[1] = 6;
        notas[notas.length - 1] = 7;

        System.out.println(notas);
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
        System.out.println(notas[notas.length - 1]);

        for (int i = 0; i <= notas.length - 1; i++) {
            System.out.println(notas[i]);
        }

        for (int nota : notas) {
            System.out.println(nota);

        }




        sc.close();
    }
}
