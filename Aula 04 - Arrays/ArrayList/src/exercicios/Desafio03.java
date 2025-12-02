package exercicios;

import java.util.ArrayList;

public class Desafio03 {
    public static void main(String[] args) {
        //Crie uma lista de números e descubra quais números são pares. Crie uma nova lista somente com os números
        //pares.
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(27);
        numeros.add(32);
        numeros.add(43);

        ArrayList<Integer> numeros_pares = new ArrayList<>();

        for (int numero : numeros){
            if (numero % 2 == 0){
                numeros_pares.add(numero);
            }
        }

        System.out.println("Os números pares são: " + numeros_pares);
    }
}
