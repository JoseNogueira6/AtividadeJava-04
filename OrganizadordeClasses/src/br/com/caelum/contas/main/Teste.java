package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class Teste {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(100.0);
        System.out.println("Ola o Saldo da sua conta é de " + conta.getSaldo());
    }
}

