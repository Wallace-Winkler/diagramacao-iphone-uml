package edu.java.iphone;

public class Telefone implements AparelhoTelefonico{
    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para o numero " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("iniciando correio de voz");
    }
}
