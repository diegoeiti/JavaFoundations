package entidades;

public class Lanche {
    private String nome;
    private double preco;

    public Lanche(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


}
