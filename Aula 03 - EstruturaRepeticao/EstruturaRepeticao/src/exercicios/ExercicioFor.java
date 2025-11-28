package exercicios;

import java.util.Scanner;

public class ExercicioFor {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();

            int resto = numero % 2;

            if (resto == 0){
                System.out.println("Número PAR");
                soma += numero;
            }

        }
        System.out.println("A soma dos numeros pares é: " + soma);


        sc.close();
    }
}
