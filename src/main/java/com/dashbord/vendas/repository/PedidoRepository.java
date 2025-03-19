package com.dashbord.vendas.repository;

import com.dashbord.vendas.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
