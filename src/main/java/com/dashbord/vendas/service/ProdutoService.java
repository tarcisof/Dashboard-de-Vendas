package com.dashbord.vendas.service;

import com.dashbord.vendas.model.Produto;
import com.dashbord.vendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findByNome() {
        return produtoRepository.findAll();
    }

    public Produto salvar (Produto produto) {
        return produtoRepository.save(produto);
    }

    public void excluir(Long id) {
        produtoRepository.deleteById(id);
    }

    public List<Produto> buscarPorIdString(Long id) {
        return produtoRepository.findAllById(Collections.singleton(id));
    }

    public Produto update(Long id, Produto produto) {
        if (produtoRepository.existsById(id)) {
            produto.setId(id);
            return produtoRepository.save(produto);
        }else{
            throw new RuntimeException("Produto não encontrado com o ID: " + id);
        }
    }
}
