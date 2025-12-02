package exercicios;

import java.util.ArrayList;

public class Desafio02 {
    public static void main(String[] args) {
        //Crie uma lista de numeros inteiros.
        //Calcule a soma e a média de todos os números da lista

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        double soma = 0;
        for (int i : numeros){
            soma += i;
        }

        double media = soma / numeros.size();
        System.out.println("A media será: " + media);
        System.out.println("A soma será: " + soma);

    }
}
