package entidades;

public class ContaBancaria {

    private String nome;
    private String cpf;
    private double saldo;

    // alt + insert para criar construtor
    public ContaBancaria(String nome, String cpf) {
        this.nome = nome;
        this.saldo = 0;
        this.cpf = cpf;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setters
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Informe um valor válido");
        } else {
            this.nome = nome;
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > this.saldo ) {
            System.out.println("Valor invalido");
        }
        this.saldo -= valor;
    }
}