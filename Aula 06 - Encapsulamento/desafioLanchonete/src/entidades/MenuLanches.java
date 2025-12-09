package entidades;

import java.util.ArrayList;

public class MenuLanches {
    private ArrayList<Lanche> cardapio = new ArrayList<>();


    public MenuLanches() {
        cardapio.add(new Lanche("X-Bacon", 35));
        cardapio.add(new Lanche("X-Salada", 30));
        cardapio.add(new Lanche("X-Tudo", 50));
    }

    public void exibirLanches() {
        System.out.println(" ID | LANCHES | PREÇO |");
        for (int i = 0; i<cardapio.size(); i++) {
            System.out.println( i + cardapio.get(i).toString());
        }
    }

    //Metodo para retornar um lanche pelo índice
    public Lanche getLanche(int indice) {
        if  (indice >= 0 && indice < cardapio.size()) {
            return cardapio.get(indice);
        } else {
            System.out.println("Indice inválido");
            return null;
        }
    }


    //Metodo para retornar o tamanho do cardápio
    public int tamanhoCardapio() {
        return cardapio.size();
    }


}