/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.ex02.Classes;

import java.util.Objects;

/**
 *
 * @author marco
 */
public class Product 
{
    private String name;
    private double cost;
    private double price;
    private String color;
    
    public Product()
    {
        this.name = "";
        this.cost = 0.0;
        this.price = 0.0;
        this.color = "";
    }

    public Product(String name, double cost, double price, String color) {
        this.name = name;
        this.cost = cost;
        this.price = price;
        this.color = color;
    }

    public Product(Product other)
    {
        this.name = other.getName();
        this.cost = other.getCost();
        this.price = other.getPrice();
        this.color = other.getColor();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void copy(Product other)
    {
        this.name = other.getName();
        this.cost = other.getCost();
        this.price = other.getPrice();
        this.color = other.getColor();
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", cost=" + cost + ", price=" + price + ", color=" + color + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.cost) ^ (Double.doubleToLongBits(this.cost) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.color);
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
        if (Double.doubleToLongBits(this.cost) != Double.doubleToLongBits(other.cost)) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.color, other.color);
    }
}
