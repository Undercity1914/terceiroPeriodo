/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.ex05.Class;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author 14731424666
 */
public class Car 
{
    private String model;
    private int year;
    private String color;
    
    public Car()
    {
        this.model = "";
        this.year = 0;
        this.color = "";
    }

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
    
    public Car(Car other)
    {
        this.model = other.getModel();
        this.year = other.getYear();
        this.color = other.getColor();
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    public void fill()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Model: ");
        this.model = readLine.nextLine();
        
        System.out.println("Release data: ");
        this.year = readLine.nextInt();
        
        System.out.println("Color: ");
        this.color = readLine.nextLine();
    }
    
    public void copy(Car other)
    {
        this.model = other.getModel();
        this.year = other.getYear();
        this.color = other.getColor();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.model);
        hash = 23 * hash + this.year;
        hash = 23 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.year != other.year) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        return Objects.equals(this.color, other.color);
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", year=" + year + ", color=" + color + '}';
    }
}
