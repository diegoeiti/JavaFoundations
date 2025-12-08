import entidades.Carro;
import entidades.Filme;

public class Main {
    public static void main(String[] args) {

        Carro carro1 =  new Carro("esportivo", 200.00, 1950);
        carro1.setModelo("");
        System.out.println(carro1.getModelo());

        carro1.setAno(1850);
        System.out.println(carro1.getAno());

        carro1.setVelocidadeMaxima(-1);
        System.out.println(carro1.getVelocidadeMaxima());


        Filme filme1 = new Filme("Titulo1", "romance", 120);
        filme1.setTitulo("");
        System.out.println(filme1.getTitulo());

        filme1.setGenero("");
        System.out.println(filme1.getGenero());

        filme1.setDuracao(-1);
        System.out.println(filme1.getDuracao());



    }
}
