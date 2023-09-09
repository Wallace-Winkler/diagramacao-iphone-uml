package edu.java.iphone;

public class Safari implements Navegador{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }
}
