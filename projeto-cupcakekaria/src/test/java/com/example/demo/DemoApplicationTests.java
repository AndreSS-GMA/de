package com.example.demo; // Lembre de manter o seu pacote aqui

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests { // Lembre de manter o nome da sua classe aqui

    @Test
    void verificarSeOSistemaLigaSemErros() {
        // Se o teste passar por essa linha e ficar verde, 
        // significa que o banco de dados e o Java estão perfeitamente conectados!
    }
}