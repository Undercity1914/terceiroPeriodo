/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.ex07.Classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Product 
{
    private String name;
    private double price;
    private double weight;
    
    public Product()
    {
        this.name = "";
        this.price = 0.0;
        this.weight = 0.0;
    }

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    
    public Product(Product other)
    {
        this.name = other.getName();
        this.price = other.getPrice();
        this.weight = other.getWeight();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void fill()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Product name: ");
        this.name = readLine.nextLine();
        
        System.out.println("Product price: ");
        this.price = readLine.nextDouble();
        
        System.out.println("Prodct weight: ");
        this.weight = readLine.nextDouble();
    }
    
    public void copy(Product other)
    {
        this.name = other.getName();
        this.price = other.getPrice();
        this.weight = other.getWeight();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
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
        final Product other = (Product) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", weight=" + weight + '}';
    }
}
