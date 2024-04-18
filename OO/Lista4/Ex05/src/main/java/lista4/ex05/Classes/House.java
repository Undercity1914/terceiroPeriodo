/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.ex05.Classes;

import java.util.Objects;

/**
 *
 * @author marco
 */
public class House 
{
    private int code;
    private String type;
    private int bedrooms;
    private double zone;
    private double price;
    
    public House()
    {
        this.code = 0;
        this.type = "";
        this.bedrooms = 0;
        this.zone = 0.0;
        this.price = 0.0;
    }

    public House(int code, String type, int bedrooms, double zone, double price) {
        this.code = code;
        this.type = type;
        this.bedrooms = bedrooms;
        this.zone = zone;
        this.price = price;
    }
    
    public House(House other)
    {
        this.code = other.getCode();
        this.type = other.getType();
        this.bedrooms = other.getBedrooms();
        this.zone = other.getZone();
        this.price = other.getPrice();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public double getZone() {
        return zone;
    }

    public void setZone(double zone) {
        this.zone = zone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void copy(House other)
    {
        this.code = other.getCode();
        this.type = other.getType();
        this.bedrooms = other.getBedrooms();
        this.zone = other.getZone();
        this.price = other.getPrice();
    }

    @Override
    public String toString() {
        return "House{" + "code=" + code + ", type=" + type + ", bedrooms=" + bedrooms + ", zone=" + zone + ", price=" + price + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.code;
        hash = 73 * hash + Objects.hashCode(this.type);
        hash = 73 * hash + this.bedrooms;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.zone) ^ (Double.doubleToLongBits(this.zone) >>> 32));
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
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
        final House other = (House) obj;
        if (this.code != other.code) {
            return false;
        }
        if (this.bedrooms != other.bedrooms) {
            return false;
        }
        if (Double.doubleToLongBits(this.zone) != Double.doubleToLongBits(other.zone)) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        return Objects.equals(this.type, other.type);
    }
}
