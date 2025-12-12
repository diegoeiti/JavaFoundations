package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Digite um numero: ");
            int valor  = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite outro numero: ");
            int valor2 = sc.nextInt();
            sc.nextLine();

            int divisao = valor / valor2;
            System.out.println("Resultado: " + divisao);
        }


        catch (InputMismatchException e) {
            System.out.println("Erro: Digite um numero!" + e.getMessage());
        } catch(ArithmeticException e) {
            System.out.println("Erro: Digite outro numero! (Divisao por 0)" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
