package exercicioPOO;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public double calcularTotal(){
        return preco * quantidade;
    }
}
