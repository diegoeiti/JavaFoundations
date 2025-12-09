package entidades;

public class Lanche {
    private String nome;
    private double preco;

    public Lanche(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return " Lanche: " +
                nome + "  |  " +
                "Preco: " + preco;
    }
}
