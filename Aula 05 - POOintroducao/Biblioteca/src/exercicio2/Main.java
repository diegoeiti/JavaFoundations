package exercicio2;

public class Main {
    public static void main(String[] args) {

    Roupa roupa1 = new Roupa("Nike", "camisa", "M", 10, 50.00);

    roupa1.toString();
    roupa1.incrementarQuantidade(20);
    roupa1.mostrarInformacoes();
    roupa1.decrementarQuantidade(10);
    roupa1.mostrarInformacoes();
    System.out.println(roupa1.valorTotalEstoque());


    }
}
