package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class TV {

    private String marca;
    private double tamanho;
    private String resolucao;
    private double preco;

    public TV() {
        this.marca = " ";
        this.tamanho = 0.0;
        this.resolucao = " ";
        this.preco = 0.0;
    }

    public TV(TV outra) {
        this.marca = outra.getMarca();
        this.tamanho = outra.getTamanho();
        this.resolucao = outra.getResolucao();
        this.preco = outra.getPreco();
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\t\tPreencha\n\n");
        System.out.println("Informe a marca: ");
        this.marca = leitor.nextLine();
        System.out.println("Informe o tamanho: ");
        this.tamanho = leitor.nextDouble();
        System.out.println("Informe o resolucao: ");
        this.resolucao = leitor.next();
        System.out.println("Informe a preco: ");
        this.preco = leitor.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.tamanho);
        System.out.println("Preco: " + this.resolucao);
        System.out.println("Memoria: " + this.preco);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getTamanho() {
        return this.tamanho;
    }

    public String getResolucao() {
        return this.resolucao;
    }

    public double getPreco() {
        return this.preco;
    }

}
