package com.example.demo; // Lembre de manter o nome do SEU pacote aqui na linha 1

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cupcakes")
public class CupcakeController {

    private final CupcakeRepository repository;

    // O VS Code acha essa forma mais "elegante" e vai tirar o sublinhado amarelo
    public CupcakeController(CupcakeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Cupcake> listarTodos() {
        return repository.findAll();
    }
}