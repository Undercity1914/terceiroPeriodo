/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.schoolproject.Management;

import trabalho.schoolproject.Classes.Person;

/**
 *
 * @author marco
 */
public class ServiceManager implements PersonManagement
{
    private PersonManagement manager;
    
    public ServiceManager(PersonManagement manager)
    {
        this.manager = manager;
    }
    
    @Override
    public Person find(Integer cpf) {
        return manager.find(cpf);
    }

    @Override
    public void add(Person newPerson) {
        manager.add(newPerson);
    }

    @Override
    public void update(Integer cpf, Person newPerson) {
        manager.update(cpf, newPerson);
    }

    @Override
    public void remove(Integer cpf) {
        manager.remove(cpf);
    }
    
    @Override
    public void salvarNoArquivo(String caminhoDoArquivo){
        manager.salvarNoArquivo(caminhoDoArquivo);
    }
    
    @Override
    public void carregarDoArquivo(String caminhoDoArquivo){
        manager.carregarDoArquivo(caminhoDoArquivo);
    }
}
