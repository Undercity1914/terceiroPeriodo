/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject1.ex01a10.classes;

/**
 *
 * @author marco
 */
public class Animal 
{
    private String especie;
    private String raca;
    private int idade;
    private double peso;
    
    public Animal()
    {
        this.especie = "";
        this.raca = "";
        this.idade = 0;
        this.peso = 0;
    }
    
    public Animal(Animal outro)
    {
        this.especie = outro.getEspecie();
        this.raca = outro.getRaca();
        this.idade = outro.getIdade();
        this.peso = outro.getPeso();
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
