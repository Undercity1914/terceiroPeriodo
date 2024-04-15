/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.ex01.Manager;

import File.CSVSerializer;
import File.FilePersistence;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lista4.ex01.classes.Person;

/**
 *
 * @author marco
 */
public class PersonManagement 
{
    private List<Person> person;
    
    public PersonManagement()
    {
        this.person = new ArrayList<>();
    }
    
    public void addPerson(Person person)
    {
        this.person.add(person);
        System.out.println("Filed!");
    }
    
    public void removePerson(String cpf)
    {
        Person person = new Person();
        int size = this.person.size();
        for(int i = 0;i < size;i++)
        {
            person = this.person.get(i);
            if(person.getCpf().equals(cpf))
            {
                this.person.remove(person);
                System.out.println("Removed!");
                i = size;
            }
        }
    }
    
    public Person findPerson(String cpf)
    {
        Person person = new Person();
        int size = this.person.size();
        for(int i = 0;i < size;i++)
        {
            person = this.person.get(i);
            if(person.getCpf().equals(cpf))
            {
                return person;
            }
        }
        return null;
    }
    
    public void updatePerson(String oldCpf, Person newPerson)
    {
        Person p = this.findPerson(oldCpf);
        if(p != null)
        {
            int index = this.person.indexOf(p);
            this.person.set(index, newPerson);
        }
        else
            System.out.println("Not Found!");
    }

    @Override
    public String toString() {
        StringBuilder print = new StringBuilder();
        for(Person person : this.person)
            print.append(person.toString()).append("\n");
        
        return print.toString();
    }
    
    public void saveToFile(String pathFile)
    {
        CSVSerializer serializer = new CSVSerializer();
        String csvData = serializer.toCSV(this.person);
        
        FilePersistence filePersistence = new FilePersistence();
        
        filePersistence.saveToFile(csvData, pathFile);
    }
    
    public void loadFromFile(String pathFile)
    {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(pathFile);
        
        CSVSerializer serializer = new CSVSerializer();
        this.person = serializer.fromCSV(csvData);
    }
}
