package exercicio;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrizBidimensional {
    public static void main(String[] args) {
        ArrayList<String> lanches = new ArrayList<>(Arrays.asList(
                "X-Burger",
                "X-Egg",
                "X-Bacon",
                "X-Salada",
                "X-Tudo"
        ));

        ArrayList<Double> menuPrecos = new ArrayList<>(Arrays.asList(
                22.9,
                24.9,
                26.9,
                26.9,
                29.9
        ));

        System.out.println("-----Cardápio-----");
        for (int i = 0; i<lanches.size();i++) {
            System.out.println(i + " - " + lanches.get(i) +  " - " + menuPrecos.get(i));
        }

    }
}
