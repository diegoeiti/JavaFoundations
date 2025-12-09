package entidades;

public class Pedido {
    private String nomeLanche;
    private double precoUnitario;
    private int quantidade;

    public Pedido(String nomeLanche, int quantidade, double precoUnitario) {
        this.nomeLanche = nomeLanche;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
    //Getters
    public String getNomeLanche() {
        return nomeLanche;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    //Setters

    public void setNomeLanche(String nomeLanche) {
        this.nomeLanche = nomeLanche;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    //Calcula valor total
    public double calcularTotal(){
        return precoUnitario * quantidade;
    }

    @Override
    public String toString() {
        return String.format("Pedido: %s | Qtd: %d | Unit: R$ %.2f | Total: R$ %.2f",
                nomeLanche, quantidade, precoUnitario, calcularTotal());
    }
}
