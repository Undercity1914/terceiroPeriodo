/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5.ex04.Manager;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lista5.ex04.Classes.Car;
import lista5.ex04.File.FilePersistence;
import lista5.ex04.File.XMLSerializer;

/**
 *
 * @author marco
 */

@XmlRootElement(name = "Cars")
public class CarManagement 
{
    @XmlElement(name = "Car")
    private List<Car> cars;
    
    public CarManagement()
    {
        this.cars = new ArrayList<>();
    }
    
    public void addCar(Car car)
    {
        this.cars.add(car);
        System.out.println("Filed!");
    }
    
    public void removeCar(Integer code)
    {
        Car car = new Car();
        int size = this.cars.size();
        
        for(int i = 0;i < size;i++)
        {
            car = this.cars.get(i);
            if(car.getCode() == code)
            {
                this.cars.remove(car);
                System.out.println(car + "Removed!");
                i = size;
                this.saveToFile("list.csv");
            }
        }
    }
    
    public Car findCar(Integer code)
    {
        for(Car car : this.cars)
        {
            if(car.getCode() == code)
                return car;
        }
        
        return null;
    }
    
    public void updateCar(Integer oldCode, Car newCar)
    {
        Car car = this.findCar(oldCode);
        if(car != null)
        {
            int index = this.cars.indexOf(car);
            this.cars.set(index, newCar);
        }
    }
    
    @Override
    public String toString() {
        StringBuilder print = new StringBuilder();
        for(Car car : this.cars)
            print.append(car.toString()).append("\n");
        
        return print.toString();
    }
    
    public void saveToFile(String pathFile)
    {
        XMLSerializer serializer = new XMLSerializer();
        String csvData = serializer.toXML(this);
        
        FilePersistence filePersistence = new FilePersistence();
        
        filePersistence.saveToFile(csvData, pathFile);
    }
    
    public void loadFromFile(String pathFile)
    {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(pathFile);
        
        XMLSerializer serializer = new XMLSerializer();
        this.cars = serializer.fromXML(csvData).cars;
    }
}
