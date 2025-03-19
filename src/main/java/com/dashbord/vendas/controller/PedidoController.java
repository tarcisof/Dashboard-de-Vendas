package com.dashbord.vendas.controller;

import com.dashbord.vendas.model.Pedido;
import com.dashbord.vendas.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> findAll(){
        return pedidoService.findAll();
    }

    @PostMapping
    public Pedido salvar(@RequestBody Pedido pedido){
        return pedidoService.salvar(pedido);
    }

    @GetMapping("/total-vendas")
    public Double getTotalVendas() {
        return pedidoService.calcularTotal();
    }
}
