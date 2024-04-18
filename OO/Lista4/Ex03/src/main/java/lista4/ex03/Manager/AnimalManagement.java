/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.ex03.Manager;

import java.util.ArrayList;
import java.util.List;
import lista4.ex03.Classes.Animal;
import lista4.ex03.file.CSVSerializer;
import lista4.ex03.file.FilePersistence;

/**
 *
 * @author marco
 */
public class AnimalManagement 
{
    private List<Animal> animals;
    
    public AnimalManagement()
    {
        this.animals = new ArrayList<>();
    }
    
    public void addAnimal(Animal animal)
    {
        this.animals.add(animal);
        System.out.println("Filed!");
    }
    
    public void removeAnimal(int code)
    {
        Animal animal = new Animal();
        int size = this.animals.size();
        
        for(int i = 0;i < size;i++)
        {
            animal = this.animals.get(i);
            if(animal.getCode() == code)
            {
                this.animals.remove(animal);
                i = size;
                System.out.println("Removed!");
                this.saveToFile("list.csv");
            }
        }
    }
    
    public Animal findAnimal(int code)
    {
        Animal animal = new Animal();
        int size = this.animals.size();
        
        for(int i = 0;i < size;i++)
        {
            animal = this.animals.get(i);
            if(animal.getCode() == code)
                return animal;
        }
        
        return null;
    }
    
    public void updateAnimal(int oldCode, Animal newAnimal)
    {
        Animal animal = this.findAnimal(oldCode);
        if(animal != null)
        {
            int index = this.animals.indexOf(animal);
            this.animals.set(index, newAnimal);
            System.out.println("Up to date!");
        }
    }
    
    @Override
    public String toString() {
        StringBuilder print = new StringBuilder();
        for(Animal animal : this.animals)
            print.append(animal.toString()).append("\n");
        
        return print.toString();
    }
    
    public void saveToFile(String pathFile)
    {
        CSVSerializer serializer = new CSVSerializer();
        String csvData = serializer.toCSV(this.animals);
        
        FilePersistence filePersistence = new FilePersistence();
        
        filePersistence.saveToFile(csvData, pathFile);
    }
    
    public void loadFromFile(String pathFile)
    {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(pathFile);
        
        CSVSerializer serializer = new CSVSerializer();
        this.animals = serializer.fromCSV(csvData);
    }
}
