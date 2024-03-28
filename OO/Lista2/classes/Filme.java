package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Filme {

    private String titulo;
    private String artista;
    private int duracao;
    private double preco;

    public Filme() {
        this.titulo = " ";
        this.artista = " ";
        this.duracao = 0;
        this.preco = 0.0;
    }

    public Filme(Filme outra) {
        this.titulo = outra.getTitulo();
        this.artista = outra.getArtista();
        this.duracao = outra.getDuracao();
        this.preco = outra.getPreco();
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\t\tPreencha\n\n");
        System.out.println("Informe a titulo: ");
        this.titulo = leitor.nextLine();
        System.out.println("Informe o artista: ");
        this.artista = leitor.next();
        System.out.println("Informe o duracao: ");
        this.duracao = leitor.nextInt();
        System.out.println("Informe a preco: ");
        this.preco = leitor.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Preco: " + this.duracao);
        System.out.println("Memoria: " + this.preco);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getArtista() {
        return this.artista;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public double getPreco() {
        return this.preco;
    }

}
