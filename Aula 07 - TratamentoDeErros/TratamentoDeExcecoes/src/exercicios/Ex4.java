package exercicios;

import java.io.FileWriter;
import java.io.IOException;

public class Ex4 {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("exemplo.txt");
            fw.write("Queijos saborosos Manoel\n");
            fw.write("Queijo palitinho\n");
            fw.write("Queijo Meia-cura\n");
            fw.write("Queijo Nozinho\n");
            fw.write("Queijo Pimenta\n");
            fw.close();
            System.out.println("Arquivo gerado com sucesso");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
