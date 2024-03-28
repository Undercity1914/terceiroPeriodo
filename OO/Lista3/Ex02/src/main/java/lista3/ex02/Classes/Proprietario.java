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
public class Proprietario 
{
    private String name;
    private Integer CPF;
    private String email;
    private Car car;
    
    public Proprietario()
    {
        this.name = "";
        this.CPF = 0;
        this.email = "";
        this.car = new Car();
    }
    
    public Proprietario(String name, Integer CPF, String email, Car car) 
    {
        this.name = name;
        this.CPF = CPF;
        this.email = email;
        this.car = new Car(car);
    }
    
    public Proprietario(Proprietario other)
    {
        this.name = other.getName();
        this.CPF = other.getCPF();
        this.email = other.getEmail();
        this.car = other.getCar();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCPF() {
        return CPF;
    }

    public void setCPF(Integer CPF) {
        this.CPF = CPF;
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
        
        System.out.println("CPF: ");
        this.CPF = readLine.nextInt();
        
        System.out.println("Email: ");
        this.email = readLine.nextLine();
        
        this.car.fill();
    }
    
    public void copy(Proprietario other)
    {
        this.name = other.getName();
        this.CPF = other.getCPF();
        this.email = other.getEmail();
        this.car = other.getCar();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.CPF);
        hash = 67 * hash + Objects.hashCode(this.email);
        hash = 67 * hash + Objects.hashCode(this.car);
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
        final Proprietario other = (Proprietario) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        return Objects.equals(this.car, other.car);
    }

    @Override
    public String toString() {
        return "Proprietario{" + "name=" + name + ", CPF=" + CPF + ", email=" + email + ", car=" + car + '}';
    }
}
