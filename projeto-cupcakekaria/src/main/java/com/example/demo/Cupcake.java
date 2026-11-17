package com.example.demo; // MUDE SE A SUA PASTA TIVER OUTRO NOME

import jakarta.persistence.*;

@Entity
public class Cupcake {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    
    public String nome;
    public String descricao;
    public Double preco;
    
    // O JPA entende que fotoUrl no Java vira foto_url no MySQL
    public String fotoUrl; 
}