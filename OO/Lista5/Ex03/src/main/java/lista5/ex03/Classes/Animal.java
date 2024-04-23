/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5.ex03.Classes;

import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marco
 */

public class Animal 
{
    private int code;
    private String species;
    private String race;
    private int age;
    private double weight; 
    
    public Animal()
    {
        this.code = 0;
        this.species = "";
        this.race = "";
        this.age = 0;
        this.weight = 0.0;
    }

    public Animal(int code, String species, String race, int age, double weight) {
        this.code = code;
        this.species = species;
        this.race = race;
        this.age = age;
        this.weight = weight;
    }
    
    public Animal(Animal other)
    {
        this.code = other.getCode();
        this.species = other.getSpecies();
        this.race = other.getRace();
        this.age = other.getAge();
        this.weight = other.getWeight();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void copy(Animal other)
    {
        this.code = other.getCode();
        this.species = other.getSpecies();
        this.race = other.getRace();
        this.age = other.getAge();
        this.weight = other.getWeight();
    }

    @Override
    public String toString() {
        return "Animal{" + "code=" + code + ", species=" + species + ", race=" + race + ", age=" + age + ", weight=" + weight + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.code;
        hash = 89 * hash + Objects.hashCode(this.species);
        hash = 89 * hash + Objects.hashCode(this.race);
        hash = 89 * hash + this.age;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
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
        final Animal other = (Animal) obj;
        if (this.code != other.code) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        if (!Objects.equals(this.species, other.species)) {
            return false;
        }
        return Objects.equals(this.race, other.race);
    }
}
