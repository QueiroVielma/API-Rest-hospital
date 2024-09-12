package com.hospital.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculoServiceTest {

    @Autowired
    private CalculoService calculoService;

    @Test
    void testSoma() {
        List<Integer> numeros = Arrays.asList(10, 10, 10, 10, 10);
        assertEquals(50, calculoService.soma(numeros));
    }

    @Test
    void testMedia() {
        List<Integer> numeros = Arrays.asList(10, 18, 15, 5, 2);
        assertEquals(10.0, calculoService.media(numeros), 0.01);
    }

    @Test
    void testMaiorEMenor() {
        List<Integer> numeros = Arrays.asList(96, 10, 7, 8, 25);
        int[] resultado = calculoService.maiorEMenor(numeros);
        assertEquals(96, resultado[0]);
        assertEquals(7, resultado[1]);
    }
}
