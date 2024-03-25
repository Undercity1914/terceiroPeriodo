/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author Windows
 */
public class Gerente {
    // nome, identificação (ID), salário, área de gerência.
    private String nome;
    private String id;
    private double salario;
    private String areaGerencia;

    public Gerente(String nome, String id, double salario, String areaGerencia) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.areaGerencia = areaGerencia;
    }
    
    public void imprimir(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Gerente{" + "nome=" + nome + ", id=" + id + ", salario=" + salario + ", areaGerencia=" + areaGerencia + '}';
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getAreaGerencia() {
        return areaGerencia;
    }

    public void setAreaGerencia(String areaGerencia) {
        this.areaGerencia = areaGerencia;
    }
    
    
}
