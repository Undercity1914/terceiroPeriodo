package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class BolsaValores {

    private String nomeEmpresa;
    private String precoAcao;
    private String volumeNegociacao;
    private double variacaoDiaria;

    public BolsaValores() {
        this.nomeEmpresa = " ";
        this.precoAcao = " ";
        this.volumeNegociacao = "";
        this.variacaoDiaria = 0.0;
    }

    public BolsaValores(BolsaValores outra) {
        this.nomeEmpresa = outra.getNomeEmpresa();
        this.precoAcao = outra.getPrecoAcao();
        this.volumeNegociacao = outra.getVolumeNegociacao();
        this.variacaoDiaria = outra.getVariacaoDiaria();
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\t\tPreencha\n\n");
        System.out.println("Informe a nomeEmpresa: ");
        this.nomeEmpresa = leitor.nextLine();
        System.out.println("Informe o precoAcao: ");
        this.precoAcao = leitor.next();
        System.out.println("Informe o volumeNegociacao: ");
        this.volumeNegociacao = leitor.next();
        System.out.println("Informe a variacaoDiaria: ");
        this.variacaoDiaria = leitor.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("NomeEmpresa: " + this.nomeEmpresa);
        System.out.println("PrecoAcao: " + this.precoAcao);
        System.out.println("VolumeNegociacao: " + this.volumeNegociacao);
        System.out.println("variacaoDiaria: " + this.variacaoDiaria);
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setPrecoAcao(String precoAcao) {
        this.precoAcao = precoAcao;
    }

    public void setVolumeNegociacao(String volumeNegociacao) {
        this.volumeNegociacao = volumeNegociacao;
    }

    public void setVariacaoDiaria(double variacaoDiaria) {
        this.variacaoDiaria = variacaoDiaria;
    }

    public String getNomeEmpresa() {
        return this.nomeEmpresa;
    }

    public String getPrecoAcao() {
        return this.precoAcao;
    }

    public String getVolumeNegociacao() {
        return this.volumeNegociacao;
    }

    public double getVariacaoDiaria() {
        return this.variacaoDiaria;
    }

}
