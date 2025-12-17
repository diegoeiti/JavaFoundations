package com.example.lojaroupa.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Informa qual tabela do banco se relaciona a entidade
@Table(name = "roupa")
// Informa que a classe Roupa é uma entidade JPA
// JPA (Mapeia a classe para o banco)
@Entity(name = "Roupa")
// Lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Roupa {

    //Informa que o ID é a chave primaria
    @Id
    //Informa que o banco gera o valor do ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double preco;

}
