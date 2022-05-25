package br.com.ayrton.tell_dont_ask_e_fail_fast.ex1;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro("HB20","Hyunday",2020,2021);

        /*Boas Práticas - Tell, don't ask*/

        //O que é errado fazer:
        if (!carro.isStatusVeiculoMotor()){
            carro.setStatusVeiculoMotor(true);
        }else{
            System.out.println("Carro já está ligado");
        }

        /*O correto é criar um método dentro da classe Carro que verifica o estado, ou seja, se ele está ou não ligado.
        * Pois, não é uma boa prática repetir o código acima em vários trechos de código, já que em projetos grandes possa
        * ser que seja necessário fazer várias verificações.
        * */


        //O correto a se fazer:
        try {
            carro.ligar(); //método criado que verifica se o carro está ou não ligado, se não estiver, liga
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
