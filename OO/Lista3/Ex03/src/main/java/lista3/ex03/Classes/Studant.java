/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.ex03.Classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Studant 
{
    private String name;
    private String registration;
    private String email;
    private String course;
    private Phone number;
    
    public Studant()
    {
        this.name = "";
        this.registration = "";
        this.email = "";
        this.course = "";
        number = new Phone();
    }

    public Studant(String name, String registration, String email, String course, Phone number) {
        this.name = name;
        this.registration = registration;
        this.email = email;
        this.course = course;
        this.number = new Phone(number);
    }
    
    public Studant(Studant other)
    {
        this.name = other.getName();
        this.registration = other.getRegistration();
        this.email = other.getEmail();
        this.course = other.getCourse();
        this.number = other.getNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Phone getNumber() {
        return number;
    }

    public void setNumber(Phone number) {
        this.number = number;
    }
    
    public void fill()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Name:");
        this.name = readLine.nextLine();
        
        System.out.println("Registration: ");
        this.registration = readLine.nextLine();
        
        System.out.println("Email:");
        this.email = readLine.nextLine();
        
        System.out.println("Course: ");
        this.course = readLine.nextLine();
    }
    
    public void copy(Studant other)
    {
        this.name = other.getName();
        this.registration = other.getRegistration();
        this.email = other.getEmail();
        this.course = other.getCourse();
        this.number = other.getNumber();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.registration);
        hash = 29 * hash + Objects.hashCode(this.email);
        hash = 29 * hash + Objects.hashCode(this.course);
        hash = 29 * hash + Objects.hashCode(this.number);
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
        final Studant other = (Studant) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.registration, other.registration)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.course, other.course)) {
            return false;
        }
        return Objects.equals(this.number, other.number);
    }

    @Override
    public String toString() {
        return "Studant{" + "name=" + name + ", registration=" + registration + ", email=" + email + ", course=" + course + ", number=" + number + '}';
    }
}
