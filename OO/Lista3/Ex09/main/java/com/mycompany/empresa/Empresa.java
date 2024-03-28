/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresa;

import classe.Departamento;
import classe.Funcionario;
import classe.Gerente;

/**
 *
 * @author Windows
 */
public class Empresa {

    public static void main(String[] args) {
        Departamento ti = new Departamento("Tecnologia da Informacao");

        Gerente gerenteTI = new Gerente("Joao", "G001", 7000.0, "Tecnologia da Informacao");
        ti.definGerente(gerenteTI);
        ti.setGerenteDep(gerenteTI);

        Funcionario funcionario1 = new Funcionario("Mariana", "F001", 4500.0);
        Funcionario funcionario2 = new Funcionario("Lucas", "F002", 4200.0);

        ti.addFuncionario(funcionario1);
        ti.addFuncionario(funcionario2);

        System.out.println("Gerente do Departamento de TI: " + ti.getGerenteDep().getNome());
        System.out.println("Funcionarios no Departamento de TI:");
        for (Funcionario funcionario : ti.getFuncionarios()) {
            System.out.println(funcionario.getNome() + " - ID: " + funcionario.getId());
        }

        ti.removeFuncionario(funcionario1);
        System.out.println("Apos a remoçao, funcionarios no Departamento de TI:");
        for (Funcionario funcionario : ti.getFuncionarios()) {
            System.out.println(funcionario.getNome() + " - ID: " + funcionario.getId());
        }
        
        ti.imprimir();
    }
        
        
        
        
}
    

