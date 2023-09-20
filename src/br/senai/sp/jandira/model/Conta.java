package br.senai.sp.jandira.model;

public class Conta {

    private int numeroConta = 1234;
    private double saldo = 9652;
    private String agencia = "000-35-XX";

    public void realizarDeposito(Double valor){
        this.saldo += valor;
        System.out.println(" Seu saldo da conta é de " + saldo);
    }
    public void realizarSaque(Double valor){
        if (valor > this.saldo){
            System.out.println("voce não pode pois não tem saldo o suficiente");
        }else {
            this.saldo -= valor;
            System.out.println("o saldo da conta é: " + saldo);
        }

    }
    public void consultarSaldo(){
        System.out.println("Seu saldo é: " + this.saldo);

    }



}
