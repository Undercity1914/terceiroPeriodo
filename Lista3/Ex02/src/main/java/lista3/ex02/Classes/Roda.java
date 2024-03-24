/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.ex02.Classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author 14731424666
 */
public class Roda 
{
    private double radial;
    private String material;
    private double weight;
    private double supMax;
    
    public Roda()
    {
        this.radial = 0.0;
        this.material = "";
        this.weight = 0.0;
        this.supMax = 0.0;
    }
    
    public Roda(Roda other)
    {
        this.radial = other.getRadial();
        this.material = other.getMaterial();
        this.weight = other.getWeight();
        this.supMax = other.getSupMax();
    }

    /**
     * @return the radial
     */
    public double getRadial() {
        return radial;
    }

    /**
     * @param radial the radial to set
     */
    public void setRadial(double radial) {
        this.radial = radial;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the supMax
     */
    public double getSupMax() {
        return supMax;
    }

    /**
     * @param supMax the supMax to set
     */
    public void setSupMax(double supMax) {
        this.supMax = supMax;
    }
    
    public void fill()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Radial: ");
        this.radial = readLine.nextDouble();
        
        System.out.println("Material: ");
        this.material = readLine.nextLine();
        
        System.out.println("Weight: ");
        this.weight = readLine.nextDouble();
        
        System.out.println("Weght support max: ");
        this.supMax = readLine.nextDouble();
    }
    
    @Override
    public String toString()
    {
        return "Roda {Radial: " + this.radial +
                ", Material: " + this.material +
                ", Weight: " + this.weight +
                ", Supp max: " + this.supMax +
                "}";
    }
    
    public void copy(Roda other)
    {
        this.radial = other.getRadial();
        this.material = other.getMaterial();
        this.weight = other.getWeight();
        this.supMax = other.getSupMax();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.radial) ^ (Double.doubleToLongBits(this.radial) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.material);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.supMax) ^ (Double.doubleToLongBits(this.supMax) >>> 32));
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
        final Roda other = (Roda) obj;
        if (Double.doubleToLongBits(this.radial) != Double.doubleToLongBits(other.radial)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.supMax) != Double.doubleToLongBits(other.supMax)) {
            return false;
        }
        return Objects.equals(this.material, other.material);
    }    
}
