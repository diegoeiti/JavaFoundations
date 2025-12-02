package exercicios;

import java.util.ArrayList;

public class ListaNomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        //Adicionar nomes na ArrayList
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Rodrigues");

        //Adicionar valor em uma posicao especifica
        nomes.add(3, "Antonio");

        //Verificar um valor na lista
        System.out.println(nomes.get(0));

        //Alterar um valor de uma posicao
        nomes.set(0,"João");

        //Retornar a posicao a partir de um valor
        System.out.println(nomes.indexOf(0));


        //Remover um elemento
        nomes.remove("Maria");
        nomes.remove(1);

        //Verifiar o tamanho da lista
        nomes.size();


        //RemoveIf
        nomes.removeIf(itens -> itens.charAt(0) == 'J');

        for(String nome : nomes){
            System.out.println(nome);
        }
        System.out.println(nomes);
    }
}
