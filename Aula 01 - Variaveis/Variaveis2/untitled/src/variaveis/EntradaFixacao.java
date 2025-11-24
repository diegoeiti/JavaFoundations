package variaveis;

import java.util.Scanner;

public class EntradaFixacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome da sua cidade: ");
        String cidade = sc.nextLine();
        System.out.println("O nome da sua cidade é: " + cidade);
        System.out.print("Digite a sigla do seu Estado: ");
        String estado = sc.nextLine();
        System.out.println("A sigla do seu Estado é: " + estado);
        // \n quebra a linha

        //Criar duas variaveis, uma para armazenar a populacao da cidade e o tamanho do seu territorio;
        System.out.print("Digite a quantidade de pessoas na cidade: ");
        int populacao = sc.nextInt();

        System.out.print("Digite o tamanho da sua cidade: ");
        double tamanho = sc.nextDouble();

        System.out.println("A cidade " + cidade + " tem " + populacao + " pessoas, e seu tamanho é de: " + tamanho + "km²" );

        sc.close();
    }
}
