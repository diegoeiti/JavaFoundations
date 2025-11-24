package variaveis;

public class VariaveisRegras {
    public static void main(String[] args){
        //Informar o tipo de valor que será armazenado
        String nome = "Manoel";

        //Nao pode atribuir valores inadequados a um tipo de variavel
        // String idade = 10; - Nao pode
        int idade = 15; // Pode


        //Nao podemos atribuir o mesmo nome pra duas variaveis
        // String nome = "Diego"; ja existe esse nome de variavel
        // String 2nome = "Diego"; nao pode comecar com numeros

        String nome2 = "Diego"; // PODE

        //Convencao
        //CamelCase
        String nomeCompleto = "Diego Eiti N F";

        //snakecase
        String nome_completo = "Diego Eiti N F";

        System.out.println(nomeCompleto + nome_completo);

    }
}
