package variaveis;

public class Exemplo {
    public static void main(String[] args) {
        System.out.print("Hello World"); // sem ln nao quebra a linha
        System.out.println("Hello World");
        System.out.print("Hello World");

        byte idade = 120;
        System.out.println(idade);
        int idade2 = 2000000000;
        System.out.println(idade2);

        double nota = 7;
        double nota2 = 10;

        double media = (nota + nota2) / 2;
        System.out.println("A sua media foi de: " + media);

        char letra = 'O';
        String nome = "Diego";

        System.out.println(letra + nome);
    }
}
