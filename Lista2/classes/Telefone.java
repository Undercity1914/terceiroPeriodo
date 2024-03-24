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
public class Telefone 
{
    private String marca;
    private String modelo;
    private double preco;
    private int memoria;
    
    public Telefone()
    {
        this.marca = "";
        this.modelo = "";
        this.preco = 0;
        this.memoria = 0;
    }
    public Telefone(Telefone outro)
    {
        this.marca = outro.getMarca();
        this.modelo = outro.getModelo();
        this.preco = outro.getPreco();
        this.memoria = outro.getMemoria();
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    /**
     * @return the memoria
     */
    public int getMemoria() {
        return memoria;
    }

    /**
     * @param memoria the memoria to set
     */
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    
    public void fill()
    {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Marca: ");
        this.marca = ler.next();
        
        System.out.print("Modelo: ");
        this.modelo = ler.next();
        
        System.out.print("Preço: ");
        this.preco = ler.nextDouble();
        
        System.out.print("Memoria: ");
        this.memoria = ler.nextInt();
    }
    
    @Override
    public String toString()
    {
        return "Telefone {Marca: " + this.marca + 
                ", Modelo: " + this.modelo +
                ", Preco: " + this.preco +
                ", Memoria: " + this.memoria +
                "}";
    }
    
    public void copy(Telefone outro)
    {
        this.marca = outro.getMarca();
        this.modelo = outro.getModelo();
        this.preco = outro.getPreco();
        this.memoria = outro.getMemoria();
    }
}
