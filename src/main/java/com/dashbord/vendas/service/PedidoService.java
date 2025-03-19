package com.dashbord.vendas.service;

import com.dashbord.vendas.model.Pedido;
import com.dashbord.vendas.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository PedidoRepository;
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> findAll() {
        return PedidoRepository.findAll();
    }

    public Pedido salvar(Pedido pedido){
        return PedidoRepository.save(pedido);
    }

    public Double calcularTotal(){
        return pedidoRepository.findAll().stream()
                .mapToDouble(Pedido::getTotal)
                .sum();
    }
}
