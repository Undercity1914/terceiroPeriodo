/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.ex05.file;

import java.util.ArrayList;
import java.util.List;
import lista4.ex05.Classes.House;

/**
 *
 * @author marco
 */
public class CSVSerializer 
{
    public List<House> fromCSV(String data)
    {
        List<House> houses = new ArrayList<>();
        
        String[] line = data.split("/z");
        
        for(int i = 1;i < line.length;i++)
        {
            String[] part = line[i].split(";");
            if(part.length >= 5)
            {
                House house = new House();
                house.setCode(Integer.parseInt(part[0]));
                house.setType(part[1]);
                house.setBedrooms(Integer.parseInt(part[2]));
                house.setZone(Double.parseDouble(part[3]));
                house.setPrice(Double.parseDouble(part[4]));
                
                houses.add(house);
            }
        }
        
        return houses;
    }
    
    public String toCSV(List<House> houses)
    {
        String csv = "Code;Type;Bedrooms;Zone;Price;/z\n";
        
        for(House house : houses)
            csv += house.getCode() + ";" 
                    + house.getType() + ";" 
                    + house.getBedrooms()+ ";"
                    + house.getZone() + ";"
                    + house.getPrice() + ";/z\n";
        return csv;
    }
}
