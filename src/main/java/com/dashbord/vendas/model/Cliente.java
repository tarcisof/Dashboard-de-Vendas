package com.dashbord.vendas.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Data
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String contato;

}
