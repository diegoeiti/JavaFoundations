package com.example.lojaroupa.controller;

import com.example.lojaroupa.model.DadosRoupa;
import com.example.lojaroupa.model.Roupa;
import com.example.lojaroupa.model.RoupaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @Autowired
    private RoupaRepository roupaRepository;

    // Registrar uma roupa no banco
    @PostMapping
    public void cadastrarRoupa(@RequestBody DadosRoupa dadosRoupa) {
        roupaRepository.save(new Roupa(dadosRoupa));
    }

    @GetMapping
    public List<Roupa> listarRoupas() {
        return roupaRepository.findAll();
    }
}
