package variaveis;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Metodo next() do Scanner captura apenas a primeira palavra
        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        sc.nextLine();
        System.out.println(nome);

        // Metodo nextLine() captura a linha inteira
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();
        System.out.println(nomeCompleto);

        // Metodo nextInt() captura numeros inteiros
        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.println(nome + " sua idade é de: " + idade +" anos");

        // Metodo nextDouble() captura numeros decimais
        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("A sua altura é de: " + altura + "m");
        sc.close();
    }
}
