package edu.java.iphone;

public class ReprodutorMP3 implements ReprodutorMusical{

    private String musica;
    @Override
    public void tocar() {
        System.out.println("Tocando " + this.musica);
    }

    @Override
    public void pausar() {
        System.out.println(this.musica + " Pausado");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println(musica + " Selecionada");
    }
}
