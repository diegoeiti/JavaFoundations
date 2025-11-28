package desafio;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        //Crie um programa desafiando a máquina
        //A máquina vai gerar um número entre 0 a 100 e você vai tentar acertar esse numero
        //O programa só vai encerrar quando você acertar, informe se o valor que o usuário digitou
        // a maior ou menor o que a gerou

        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100);
        int numerTentativas = 0;
        System.out.println("Chute um número de 0 a 100!");

        while(true) {

            int inputUsuario = sc.nextInt();

            if (inputUsuario < numeroAleatorio) {
                System.out.println("Número muito baixo!");
                numerTentativas++;
                System.out.println("Número de tentativas: " +  numerTentativas);
            }
            else if (inputUsuario > numeroAleatorio) {
                System.out.println("Número muito alto");
                numerTentativas++;
                System.out.println("Número de tentativas: " +  numerTentativas);
            }
            else if (inputUsuario == numeroAleatorio) {
                System.out.println("Acertou!");
                System.out.println("Número de tentativas: " +  numerTentativas);
                break;

        }

        }

        sc.close();
    }
}
