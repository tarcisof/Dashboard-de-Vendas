package com.dashbord.vendas.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private LocalDate data;
    private Double total;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<ItemPedido> itens = new ArrayList<>();

}
