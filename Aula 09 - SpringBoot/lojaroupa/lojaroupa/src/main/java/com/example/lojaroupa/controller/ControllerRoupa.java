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
@CrossOrigin(origins ="*")// Isso permite que o index.html acesse a API
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

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        roupaRepository.deleteById(id);
        return "Roupa com ID " + id + " deletada com sucesso!";
    }

    @PutMapping("/{id}")
    public Roupa atualizar(@PathVariable Long id, @RequestBody Roupa roupaAtualizada) {
        // 1. Procuramos a roupa no banco pelo ID
        return roupaRepository.findById(id).map(roupa -> {
            // 2. Atualizamos os dados com o que veio do Postman
            roupa.setMarca(roupaAtualizada.getMarca());
            roupa.setTipo(roupaAtualizada.getTipo());
            roupa.setTamanho(roupaAtualizada.getTamanho());
            roupa.setPreco(roupaAtualizada.getPreco());
            roupa.setQuantidade(roupaAtualizada.getQuantidade());
            // 3. Salvamos a roupa atualizada
            return roupaRepository.save(roupa);
        }).orElseThrow(() -> new RuntimeException("Roupa não encontrada"));
    }
}
