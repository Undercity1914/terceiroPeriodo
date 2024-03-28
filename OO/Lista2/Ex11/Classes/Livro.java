/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject1.ex01a10.classes;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Livro 
{
    private String titulo;
    private String autor;
    private int numPag;
    private double preco;
    
    public Livro()
    {
        this.titulo = "";
        this.autor = "";
        this.numPag = 0;
        this.preco = 0;
    }
    
    public Livro(Livro outro)
    {
        this.titulo = outro.getTitulo();
        this.autor = outro.getAutor();
        this.numPag = outro.getNumPag();
        this.preco = outro.getPreco();
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the numPag
     */
    public int getNumPag() {
        return numPag;
    }

    /**
     * @param numPag the numPag to set
     */
    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void fill()
    {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Titulo: ");
        this.titulo = ler.next();
        
        System.out.print("Autor: ");
        this.autor = ler.next();
        
        System.out.print("Preço: ");
        this.preco = ler.nextDouble();
        
        System.out.print("Número de Páginas: ");
        this.numPag = ler.nextInt();
    }
    
    @Override
    public String toString()
    {
        return "Livro {Titulo: " + this.titulo + 
                ", Autor: " + this.autor +
                ", Preco: " + this.preco +
                ", Número de Páginas: " + this.numPag +
                "}";
    }
    
    public void copy(Livro outro)
    {
        this.titulo = outro.getTitulo();
        this.autor = outro.getAutor();
        this.numPag = outro.getNumPag();
        this.preco = outro.getPreco();
    }
}
