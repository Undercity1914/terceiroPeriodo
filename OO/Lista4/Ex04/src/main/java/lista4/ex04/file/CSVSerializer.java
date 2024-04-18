/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.ex04.file;

import java.util.ArrayList;
import java.util.List;
import lista4.ex04.Classes.Car;

/**
 *
 * @author marco
 */
public class CSVSerializer 
{
    public List<Car> fromCSV(String data)
    {
        List<Car> cars = new ArrayList<>();
        
        String[] line = data.split("/z");
        
        for(int i = 1;i < line.length;i++)
        {
            String[] part = line[i].split(";");
            if(part.length >= 5)
            {
                Car car = new Car();
                car.setCode(Integer.parseInt(part[0]));
                car.setBrand(part[1]);
                car.setModel(part[2]);
                car.setYear(Integer.parseInt(part[3]));
                car.setPrice(Double.parseDouble(part[4]));
                
                cars.add(car);
            }
        }
        
        return cars;
    }
    
    public String toCSV(List<Car> cars)
    {
        String csv = "Code;Brand;Model;Year;Price;/z\n";
        
        for(Car car : cars)
            csv += car.getCode() + ";" 
                    + car.getBrand() + ";" 
                    + car.getModel() + ";"
                    + car.getYear() + ";"
                    + car.getPrice() + ";/z\n";
        return csv;
    }
}
