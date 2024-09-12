package com.hospital.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculoService {
    public int soma(List<Integer> numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public double media(List<Integer> numeros) {
        double soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma / numeros.size();
    }

    public int[] maiorEMenor(List<Integer> numeros) {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        return new int[]{maior, menor};
    }
}
