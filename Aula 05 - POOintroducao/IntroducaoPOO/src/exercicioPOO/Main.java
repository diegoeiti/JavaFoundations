package exercicioPOO;

import exercicio.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoPOO aluno1 = new AlunoPOO();

        System.out.println("Digite o nome do aluno: ");
        aluno1.nome = sc.nextLine();

        System.out.println("Digite a nota do aluno: ");
        aluno1.nota = sc.nextDouble();

        System.out.println("Digite a nota do aluno: ");
        aluno1.nota2 = sc.nextDouble();



        System.out.println(aluno1.nome);
        System.out.println(aluno1.nota);
        System.out.println(aluno1.nota2);
        System.out.println(aluno1.calcularMedia());
        sc.nextLine();

        //Criando uma instancia da classe Produto
        Produto produto1 = new Produto();

        System.out.println("Digite o nome do produto: ");
        produto1.nome = sc.nextLine();

        System.out.println("Digite o preço do produto: ");
        produto1.preco = sc.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        produto1.quantidade = sc.nextInt();

        System.out.println(produto1.nome);
        System.out.println(produto1.preco);
        System.out.println(produto1.quantidade);
        System.out.println("O valor total no estoque é: " +produto1.calcularTotal());
    }
}
