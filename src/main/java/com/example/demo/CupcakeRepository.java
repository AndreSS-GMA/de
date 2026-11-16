package com.example.demo; // MUDE SE A SUA PASTA TIVER OUTRO NOME

import org.springframework.data.jpa.repository.JpaRepository;

public interface CupcakeRepository extends JpaRepository<Cupcake, Integer> {
}