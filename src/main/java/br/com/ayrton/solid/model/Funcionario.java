package br.com.ayrton.solid.model;

import br.com.ayrton.solid.enums.Cargo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

    private DadosPessoais dadosPessoais;
    private LocalDate dataUltimoReajuste;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
    }

    public void atualizarSalario(BigDecimal novoSalario) {
        this.dadosPessoais.setSalario(novoSalario);
    }

    public void atualizarDataDoUltimoReajuste() {
        this.dataUltimoReajuste = LocalDate.now();
    }

    public Cargo getCargo() {
        return this.dadosPessoais.getCargo();
    }

    public void setCargo(Cargo cargo) {
        this.dadosPessoais.setCargo(cargo);
    }

    public BigDecimal getSalario() {
        return this.dadosPessoais.getSalario();
    }

    public void setSalario(BigDecimal salario) {
        this.dadosPessoais.setSalario(salario);
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
        this.dataUltimoReajuste = dataUltimoReajuste;
    }

    public void promover(Cargo novoCargo) {
        this.dadosPessoais.setCargo(novoCargo);
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }
}
