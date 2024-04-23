/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5.ex04.Classes;

import java.util.Objects;

/**
 *
 * @author marco
 */
public class Car 
{
    private int code;
    private String brand;
    private String model;
    private Integer year;
    private double price;
    
    public Car()
    {
        this.code = 0;
        this.brand = "";
        this.year = 0;
        this.price = 0.0;
        this.model = "";
    }

    public Car(int code, String brand, Integer year, double price, String model) {
        this.code = code;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.model = model;
    }
    
    public Car(Car other)
    {
        this.code = other.getCode();
        this.brand = other.getBrand();
        this.year = other.getYear();
        this.price = other.getPrice();
        this.model =  other.getModel();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public void copy(Car other)
    {
        this.code = other.getCode();
        this.brand = other.getBrand();
        this.year = other.getYear();
        this.price = other.getPrice();
        this.model =  other.getModel();
    }

    @Override
    public String toString() {
        return "Car{" + "code=" + code + ", brand=" + brand + ", model=" + model + ", year=" + year + ", price=" + price + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.code;
        hash = 97 * hash + Objects.hashCode(this.brand);
        hash = 97 * hash + Objects.hashCode(this.model);
        hash = 97 * hash + Objects.hashCode(this.year);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
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
        if (this.code != other.code) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        return Objects.equals(this.year, other.year);
    }
}
