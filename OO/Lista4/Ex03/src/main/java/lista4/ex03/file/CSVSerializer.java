/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.ex03.file;

import java.util.ArrayList;
import java.util.List;
import lista4.ex03.Classes.Animal;

/**
 *
 * @author marco
 */
public class CSVSerializer 
{
    public List<Animal> fromCSV(String data)
    {
        List<Animal> animals = new ArrayList<>();
        
        String[] line = data.split("/z");
        
        for(int i = 1;i < line.length;i++)
        {
            String[] part = line[i].split(";");
            if(part.length >= 5)
            {
                Animal animal = new Animal();
                animal.setCode(Integer.parseInt(part[0]));
                animal.setSpecies(part[1]);
                animal.setRace(part[2]);
                animal.setAge(Integer.parseInt(part[3]));
                animal.setWeight(Double.parseDouble(part[4]));
                
                animals.add(animal);
            }
        }
        
        return animals;
    }
    
    public String toCSV(List<Animal> animals)
    {
        String csv = "Code;Species;Race;Age;Weight;/z\n";
        
        for(Animal animal : animals)
            csv += animal.getCode() + ";" 
                    + animal.getSpecies() + ";" 
                    + animal.getRace() + ";"
                    + animal.getAge() + ";"
                    + animal.getWeight() + ";/z\n";
        return csv;
    }
}
