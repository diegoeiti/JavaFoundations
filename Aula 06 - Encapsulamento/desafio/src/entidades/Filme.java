package entidades;

public class Filme {
    private String titulo;
    private String genero;
    private int duracao;

    //getters
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public Filme(String titulo, String genero, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    //setters
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("Titulo inválido");
        } else {
            this.titulo = titulo;
        }
    }

    public void setGenero(String genero) {
        if (genero == null || genero.trim().isEmpty()) {
            System.out.println("Genero inválido");
        }
    }

    public void setDuracao(int duracao) {
        if (duracao <= 0) {
            System.out.println("Duração inválida");
        } else  {
            this.duracao = duracao;
        }
    }


}
