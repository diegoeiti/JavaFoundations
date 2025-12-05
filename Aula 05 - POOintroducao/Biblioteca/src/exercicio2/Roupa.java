package exercicio2;

public class Roupa {
    String marca;
    String tipo;
    String tamanho;
    int quantidade;
    double preco;

    //Construtor
    public Roupa(String marca, String tipo, String tamanho, int quantidade, double preco) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double valorTotalEstoque() {
        return this.quantidade * this.preco;
    }

    public void incrementarQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
    }

    public void decrementarQuantidade(int quantidade) {
        if (quantidade < 0 || quantidade > this.quantidade) {
            System.out.println("Valor Inválido");
        } else {
            this.quantidade -= quantidade;
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preco: " + this.preco);
    }




}
