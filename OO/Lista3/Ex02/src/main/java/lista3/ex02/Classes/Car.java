/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.ex02.Classes;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author 14731424666
 */
public class Car 
{   
    private String fac;
    private String model;
    private double engine;
    private String color;
    private Roda[] wheel= new Roda[4];
    
    public Car()
    {
        this.fac = "";
        this.model = "";
        this.engine = 0.0;
        this.color = "";
        //Roda wheelAux = new Roda();
        //wheelAux.fill();
        for(int i = 0;i < 4;i++)
            wheel[i] = new Roda();
    }
    
    public Car(Car other)
    {
        this.fac = other.getFac();
        this.model = other.getModel();
        this.engine = other.getEngine();
        this.color = other.getColor();
        this.wheel = other.getWheel();
    }

    /**
     * @return the fac
     */
    public String getFac() {
        return fac;
    }

    /**
     * @param fac the fac to set
     */
    public void setFac(String fac) {
        this.fac = fac;
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
     * @return the engine
     */
    public double getEngine() {
        return engine;
    }

    /**
     * @param engine the engine to set
     */
    public void setEngine(double engine) {
        this.engine = engine;
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

    /**
     * @return the wheel
     */
    public Roda[] getWheel() {
        return wheel;
    }

    /**
     * @param wheel the wheel to set
     */
    public void setWheel(Roda[] wheel) {
        this.wheel = wheel;
    }
        
    public void fill()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Manufactorer: ");
        this.fac = readLine.nextLine();
        
        System.out.println("Model: ");
        this.model = readLine.nextLine();
        
        System.out.println("Engine: ");
        this.engine = readLine.nextDouble();
        
        System.out.println("Color: ");
        this.color = readLine.nextLine();
        
        for(int i = 0;i < 4;i++)
        {
            wheel[i].fill();
        }
    }

    @Override
    public String toString() {
        return "Car{" + "fac=" + fac 
                + ", model=" + model 
                + ", engine=" + engine 
                + ", color=" + color 
                + ", wheel=" + wheel
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.fac);
        hash = 41 * hash + Objects.hashCode(this.model);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.engine) ^ (Double.doubleToLongBits(this.engine) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.color);
        hash = 41 * hash + Arrays.deepHashCode(this.wheel);
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
        if (Double.doubleToLongBits(this.engine) != Double.doubleToLongBits(other.engine)) {
            return false;
        }
        if (!Objects.equals(this.fac, other.fac)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return Arrays.deepEquals(this.wheel, other.wheel);
    }
    
     
}
