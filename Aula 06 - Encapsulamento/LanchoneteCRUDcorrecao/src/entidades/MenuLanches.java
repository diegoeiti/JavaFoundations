package entidades;

import java.util.ArrayList;

public class MenuLanches {
    private ArrayList<Lanche> cardapio = new ArrayList<>();


    //Inicializa o lista com os objetos lanches
    public MenuLanches() {
        cardapio.add(new Lanche("X-Burguer", 20));
        cardapio.add(new Lanche("X-Egg", 24));
        cardapio.add(new Lanche("X-Bacon", 26));
        cardapio.add(new Lanche("X-Salada", 28));
        cardapio.add(new Lanche("X-Frango", 30));
        cardapio.add(new Lanche("X-TUDO", 35));
    }

    //Percorre a lista cardapio e mostra todos os lanches cadastrados
    public void exibirCardapio() {
        System.out.println("|||||     CARDÁPIO     |||||");
        System.out.println("| ID | LANCHE | PRECO UNITARIO |");
        for (int i = 0; i < cardapio.size(); i++) {
            System.out.println(" | " + i + cardapio.get(i).toString());
        }
    }


    //Retorna o lanche a partir da sua posicao na lista
    public Lanche getCardapio(int i) {
        return cardapio.get(i);
    }



}
