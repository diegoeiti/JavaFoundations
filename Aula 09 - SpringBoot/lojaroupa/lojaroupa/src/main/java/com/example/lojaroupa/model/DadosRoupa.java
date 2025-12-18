package com.example.lojaroupa.model;

public record DadosRoupa(
        String tipo,
        String marca,
        String tamanho,
        int quantidade,
        double preco
) {
}
