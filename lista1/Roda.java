/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex01;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Roda 
{
    private String marca;
    private double codigo;
    private double peso;
    private double preco;
    
//atributos
    
    public Roda()
    {
        this.marca = "";
        this.codigo = 0;
        this.peso = 0.0;
        this.preco = 0.0;
    }
    
    //getters
    
    public String getMarca()
    {
        return this.marca;
    }
    
    public double getCodigo()
    {
        return this.codigo;
    }
    
    public double getPeso()
    {
        return this.peso;
    }
    
    public double getPreco()
    {
        return this.preco;
    }
    
    //setters
    
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public void setCodigo(double codigo)
    {
        this.codigo = codigo;
    }
    
    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
    
    //print e fill
    
    public void print()
    {
        System.out.println("Marca" + this.getMarca());
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Preço: " + this.getPreco());
    }
    
    public void fill()
    {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Marca: ");
        this.marca = ler.next();
        
        System.out.print("Codigo: ");
        this.codigo = ler.nextDouble();
        
        System.out.print("Peso: ");
        this.peso = ler.nextDouble();
        
        System.out.print("Preco: ");
        this.preco = ler.nextDouble();
    }
}
