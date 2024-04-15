/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.util.ArrayList;
import java.util.List;
import lista4.ex01.classes.Person;

/**
 *
 * @author marco
 */
public class CSVSerializer 
{
    public List<Person> fromCSV(String data)
    {
        List<Person> people = new ArrayList<>();
        
        String[] line = data.split("\n");
        
        for(int i = 1;i < line.length;i++)
        {
            String[] part = line[i].split(";");
            if(part.length >= 4)
            {
                Person person = new Person();
                person.setName(part[0]);
                person.setCpf(part[1]);
                person.setAge(Integer.parseInt(part[2]));
                person.setSex(part[3]);
                
                people.add(person);
            }
        }
        
        return people;
    }
    
    public String toCSV(List<Person> people)
    {
        String csv = "Name;CPF;Age;Sex;\n";
        
        for(Person person : people)
            csv += person.getName() + ";" 
                    + person.getCpf() + ";" 
                    + person.getAge() + ";" 
                    + person.getSex() + ";\n";
        return csv;
    }
}
