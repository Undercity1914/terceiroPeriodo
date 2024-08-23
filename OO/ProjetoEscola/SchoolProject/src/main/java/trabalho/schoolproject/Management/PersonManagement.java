/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trabalho.schoolproject.Management;

import trabalho.schoolproject.Classes.Person;

/**
 *
 * @author marco
 */
public interface PersonManagement 
{
    Person find(Integer cpf);
    void add(Person newPerson);
    void update(Integer cpf, Person newPerson);
    void remove(Integer cpf);
    void salvarNoArquivo(String caminhoDoArquivo);
    public void carregarDoArquivo(String caminhoDoArquivo);
}
