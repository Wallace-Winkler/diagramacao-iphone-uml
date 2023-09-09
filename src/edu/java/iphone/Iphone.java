package edu.java.iphone;

public class Iphone {
    public static void main(String[] args) {
        Safari safari = new Safari();
        ReprodutorMP3 reprodutorMP3 = new ReprodutorMP3();
        Telefone telefone = new Telefone();

        safari.adicionarNovaAba();
        safari.atualizarPagina();
        safari.exibirPagina();

        reprodutorMP3.selecionarMusica("Musica1");
        reprodutorMP3.tocar();
        reprodutorMP3.pausar();

        telefone.ligar(999999999);
        telefone.atender();
        telefone.iniciarCorreioDeVoz();
    }
}
