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
public class Driver 
{
    private String name;
    private int age;
    private String email;
    private Car car;
    
    public Driver()
    {
        this.name = "";
        this.age = 0;
        this.email = "";
        this.car = new Car();
    }

    public Driver(String name, int age, String email, Car car) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.car = new Car(car);
    }
    
    public Driver(Driver other)
    {
        this.name = other.getName();
        this.age = other.getAge();
        this.email = other.getEmail();
        this.car = other.getCar();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    public void fill()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Name: ");
        this.name = readLine.nextLine();
        
        System.out.println("Age: ");
        this.age = readLine.nextInt();
        
        System.out.println("Email: ");
        this.email = readLine.nextLine();
        
        this.car.fill();
    }
    
    public void copy(Driver other)
    {
        this.name = other.getName();
        this.age = other.getAge();
        this.email = other.getEmail();
        this.car = other.getCar();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + this.age;
        hash = 37 * hash + Objects.hashCode(this.email);
        hash = 37 * hash + Objects.hashCode(this.car);
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
        final Driver other = (Driver) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.car, other.car);
    }

    @Override
    public String toString() {
        return "Driver{" + "name=" + name + ", age=" + age + ", email=" + email + ", car=" + car + '}';
    }
}
