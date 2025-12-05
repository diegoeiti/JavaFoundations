package exercicio;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua nota: ");
        double nota = sc.nextDouble();

        System.out.println("Digite sua nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota+nota2)/2;

        System.out.println("Sua media foi: " + media);



        sc.close();
    }
}
