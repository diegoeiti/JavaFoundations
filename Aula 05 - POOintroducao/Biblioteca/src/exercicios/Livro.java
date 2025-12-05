package exercicios;

public class Livro {
    String titulo;
    String autor;
    String editora;
    double preco;
    int quantidade;

    public Livro(String titulo, String autor, String editora, double preco, int quantidade  ) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void mostrarInformacoes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editora: " + this.editora);
        System.out.println("Preco: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Valor total: " + this.preco * this.quantidade);
    }

    public void alugarLivro(int quantidade){
        if (quantidade < 0 || quantidade > this.quantidade){
            System.out.println("Valor Inválido");
        } else {
            this.quantidade -=  quantidade;
            System.out.println("Livro alugado com sucesso");
        }
    }

    public void devolverLivro(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Livro devolvido com sucesso");
        } else {
            System.out.println("Valor Inválido");
        }
    }

    public double valorTotal() {
        return this.preco + this.quantidade;
    }



}
