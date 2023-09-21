package br.edu.ifpb.pdist.service;

import br.edu.ifpb.pdist.ejbRemote.CalculadoraIF;
import jakarta.ejb.Stateless;

@Stateless(name = "calculadoraService")
public class CalculadoraService implements CalculadoraIF {
    @Override
    public int somar(int num1, int num2) {
        int soma = num1 + num2;
        return soma;
    }
}
