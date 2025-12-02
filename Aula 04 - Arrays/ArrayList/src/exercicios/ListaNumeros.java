package exercicios;

import java.util.ArrayList;

public class ListaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        for (int i : lista){
            System.out.println(i);
        }
    }
}
