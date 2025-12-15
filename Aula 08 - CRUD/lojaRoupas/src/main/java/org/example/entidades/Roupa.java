package org.example.entidades;

public class Roupa {
    String marca;
    String tipo;
    String tamanho;
    int quantidade;
    double preco;

    public Roupa(String marca, String tipo, String tamanho, int quantidade, double preco) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double valorEstoqueTotal(){
        return quantidade * preco;
    }


}
