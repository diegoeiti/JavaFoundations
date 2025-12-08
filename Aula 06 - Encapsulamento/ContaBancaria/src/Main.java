import entidades.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("nome", "44801590889");


        System.out.println(conta.getCpf());


    }
}
