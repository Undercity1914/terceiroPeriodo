/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class Departamento {
    // nome do departamento, gerente do departamento (do tipo Gerente),
    //lista de funcionários (do tipo Funcionário).
        private String nomeDep;
        private Gerente gerenteDep;
        private List<Funcionario> funcionarios = new ArrayList<>();
    

    public Departamento(String nomeDep) {
        this.nomeDep = nomeDep;
        this.gerenteDep = gerenteDep;
    }
    
    
    
    public void addFuncionario(Funcionario funcio){
        this.funcionarios.add(funcio);
    }
    
    public void removeFuncionario(Funcionario funcio){
        this.funcionarios.remove(funcio);
    }
    
    public void definGerente(Gerente gerent){
        this.gerenteDep = gerent;
        
    }
    public void imprimir(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Departamento{" + "nomeDep=" + nomeDep + ", gerenteDep=" + gerenteDep + ", funcionarios=" + funcionarios + '}';
    }
    
    

    public String getNomeDep() {
        return nomeDep;
    }

    public void setNomeDep(String nomeDep) {
        this.nomeDep = nomeDep;
    }

    public Gerente getGerenteDep() {
        return gerenteDep;
    }

    public void setGerenteDep(Gerente gerenteDep) {
        this.gerenteDep = gerenteDep;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
        
        
}
