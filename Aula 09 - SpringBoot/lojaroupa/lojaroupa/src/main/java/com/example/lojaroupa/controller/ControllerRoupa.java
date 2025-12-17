package com.example.lojaroupa.controller;

import org.springframework.web.bind.annotation.*;

//Controller - Responsavel por receber as requisicoes em HTTP (metodos)
// Rest - API rest

//Funcionamento da API REST
// Metodo GET - Busca dados
// Metodo POST - Inserir ou inserir dados
// Metodo PUT - Atualizar dados
// Metodo DELETE - Excluir dados

@RestController
@RequestMapping("/roupas") //Defina a URL do controller
//http://localhost:8080/roupas

@CrossOrigin(origins ="*")
public class ControllerRoupa {

    // Registrar uma roupa no banco
    @PostMapping
    public void cadastrarRoupa(@RequestBody String roupa) {
        System.out.println(roupa);
    }
}
