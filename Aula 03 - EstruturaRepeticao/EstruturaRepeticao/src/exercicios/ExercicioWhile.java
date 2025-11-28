package exercicios;

import java.util.Scanner;

public class ExercicioWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Digite um numero (Digite 999 para parar): ");
            int num = sc.nextInt();

            if (num == 999){
                System.out.println("Finalizado");
                break;
            }

            System.out.println(num);

        }

        sc.close();
    }
}
