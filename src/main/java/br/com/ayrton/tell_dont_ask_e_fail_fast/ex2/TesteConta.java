package br.com.ayrton.tell_dont_ask_e_fail_fast.ex2;

import java.math.BigDecimal;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositar(new BigDecimal(100));

        System.out.println(conta.getSaldo());

        System.out.println();

        conta.sacar(new BigDecimal(50));

        System.out.println(conta.getSaldo());


    }
}
