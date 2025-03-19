package com.dashbord.vendas.controller;

import com.dashbord.vendas.model.Cliente;
import com.dashbord.vendas.model.Produto;
import com.dashbord.vendas.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listarTodos(){
        return produtoService.findByNome();
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        return produtoService.salvar(produto);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        produtoService.excluir(id);
    }

    // Atualizar um produto por ID
    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        Produto produtoAtualizado = produtoService.update(id, produto);
        return ResponseEntity.ok(produtoAtualizado);
    }
}
