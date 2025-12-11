package entidades;

public class Pedido {
    private String nomeLanche;
    private int quantidade;
    private double preco;


    //Inicializa o pedido com os valores do lanche
    public Pedido(String nomeLanche, int quantidade, double preco) {
        this.nomeLanche = nomeLanche;
        this.quantidade = quantidade;
        this.preco = preco;
    }


    //Getters - Consultar atributos privados
    public String getNomeLanche() {
        return nomeLanche;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    //Setters - Atualizar atributos privados

    public void setNomeLanche(String nomeLanche) {
        this.nomeLanche = nomeLanche;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Calcular Valor Total
    public double calcularTotal() {
        return this.quantidade * this.preco;
    }

    //Metodo toString() para mostrar os atributos do pedido

    @Override
    public String toString() {
        return " | " + nomeLanche + " | " + quantidade + " | " + preco + " | " + calcularTotal();
    }


}
