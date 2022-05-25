package br.com.ayrton.tell_dont_ask_e_fail_fast.ex1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carro {
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private int anoModelo;

    private boolean statusVeiculoMotor = false;

    public Carro(String modelo, String marca, int anoFabricacao, int anoModelo) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
    }


    public void ligar() throws Exception {
        if (statusVeiculoMotor) {
            throw new Exception("Carro já ligado");
        }

        this.statusVeiculoMotor = true;

        /* Fail Fast - Técnica que valida o caso de erro antes para que seja evitado o uso de else */
    }
}
