/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.ex05.Manager;

import java.util.ArrayList;
import java.util.List;
import lista4.ex05.Classes.House;
import lista4.ex05.file.CSVSerializer;
import lista4.ex05.file.FilePersistence;

/**
 *
 * @author marco
 */
public class HouseManagement 
{
    private List<House> houses;
    
    public HouseManagement()
    {
        this.houses = new ArrayList<>();
    }
    
    public void addHouse(House house)
    {
        this.houses.add(house);
        System.out.println("Filed!");
    }
    
    public void removeHouse(Integer code)
    {
        House house = new House();
        int size = this.houses.size();
        
        for(int i = 0;i < size;i++)
        {
            house = this.houses.get(i);
            if(house.getCode() == code)
            {
                this.houses.remove(house);
                System.out.println(house + ", Removed!");
                i = size;
            }
        }
    }
    
    public House findHouse(Integer code)
    {
        for(House house : this.houses)
            if(house.getCode() == code)
                return house;
        
        return null;
    }
    
    public void updateHouse(Integer oldCode, House newHouse)
    {
        House house = this.findHouse(oldCode);
        if(house != null)
        {
            int index = this.houses.indexOf(house);
            this.houses.set(index, newHouse);
            System.out.println("Up to date!");
        }
    }
    
    @Override
    public String toString() {
        StringBuilder print = new StringBuilder();
        for(House house : this.houses)
            print.append(house.toString()).append("\n");
        
        return print.toString();
    }
    
    public void saveToFile(String pathFile)
    {
        CSVSerializer serializer = new CSVSerializer();
        String csvData = serializer.toCSV(this.houses);
        
        FilePersistence filePersistence = new FilePersistence();
        
        filePersistence.saveToFile(csvData, pathFile);
    }
    
    public void loadFromFile(String pathFile)
    {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(pathFile);
        
        CSVSerializer serializer = new CSVSerializer();
        this.houses = serializer.fromCSV(csvData);
    }
}
