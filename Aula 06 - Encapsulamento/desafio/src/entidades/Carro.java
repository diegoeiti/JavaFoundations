package entidades;

public class Carro {
    private String modelo;
    private int ano;
    private double velocidadeMaxima;

    public Carro(String modelo, double velocidadeMaxima, int ano) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.ano = ano;
    }

    //getters
    public String getModelo() {
        return modelo;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getAno() {
        return ano;
    }


    //setters
    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            System.out.println("Modelo inválido");
        } else  {
            this.modelo = modelo;
        }
    }

    public void setAno(int ano) {
        if (ano < 1886) {
            System.out.println("Ano inválido");
        } else   {
            this.ano = ano;
        }
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if (velocidadeMaxima < 0) {
            System.out.println("Velocidade inválida");
        }
    }




}
