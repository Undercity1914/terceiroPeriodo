package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Casa {

    private String endereco;
    private double area;
    private int numQuarto;
    private double preco;

    public Casa() {
        this.endereco = " ";
        this.area = 0.0;
        this.numQuarto = 0;
        this.preco = 0.0;
    }

    public Casa(Casa outra) {
        this.endereco = outra.getEndereco();
        this.area = outra.getArea();
        this.numQuarto = outra.getNumQuarto();
        this.preco = outra.getPreco();
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\t\tPreencha\n\n");
        System.out.println("Informe a endereco: ");
        this.endereco = leitor.nextLine();
        System.out.println("Informe o area: ");
        this.area = leitor.nextDouble();
        System.out.println("Informe o numQuarto: ");
        this.numQuarto = leitor.nextInt();
        System.out.println("Informe a preco: ");
        this.preco = leitor.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Modelo: " + this.area);
        System.out.println("Preco: " + this.numQuarto);
        System.out.println("Memoria: " + this.preco);
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public double getArea() {
        return this.area;
    }

    public int getNumQuarto() {
        return this.numQuarto;
    }

    public double getPreco() {
        return this.preco;
    }

}
