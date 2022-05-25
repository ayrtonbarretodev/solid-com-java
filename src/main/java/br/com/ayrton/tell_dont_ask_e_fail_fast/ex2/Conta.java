package br.com.ayrton.tell_dont_ask_e_fail_fast.ex2;

import java.math.BigDecimal;

public class Conta {
    BigDecimal saldo;

    public Conta() {
        this.saldo = new BigDecimal("0");
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void verificaSeValorENegativo(BigDecimal valorADepositar) throws Exception {
        if (valorADepositar.doubleValue()<0){
            throw new Exception("Impossível depositar/sacar valores negativos");
        }
    }

    public void verificaSeValorDoSaqueEMaiorQueSaldo(BigDecimal valorASacar) throws Exception {
        if (valorASacar.compareTo(this.saldo) == 1){
            throw new Exception("Impossível sacar um valor maior do que o disponível em conta");
        }
    }

    public void depositar(BigDecimal valor) {
        try {
            verificaSeValorENegativo(valor);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        this.saldo=this.saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        try {
            verificaSeValorENegativo(valor);
            verificaSeValorDoSaqueEMaiorQueSaldo(valor);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        this.saldo=this.saldo.subtract(valor);
    }

}
