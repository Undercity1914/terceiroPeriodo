/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.ex3_1.Classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Professor 
{
    private String name;
    private String gender;
    private int age;
    private Integer cpf;

    public Professor(String name, String gender, int age, Integer cpf) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.cpf = cpf;
    }
    
    public Professor()
    {
        this.name = "";
        this.gender = "";
        this.age = 0;
        this.cpf = 0;
    }
    
    public Professor(Professor other)
    {
        this.name = other.getName();
        this.gender = other.getGender();
        this.age = other.getAge();
        this.cpf = other.getCpf();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
    
    public void fill()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Name:");
        this.name = readLine.nextLine();
        
        System.out.println("Gender: ");
        this.gender = readLine.nextLine();
        
        System.out.println("Age:");
        this.age = readLine.nextInt();
        
        System.out.println("CPF: ");
        this.cpf = readLine.nextInt();
    }
    
    public void copy(Professor other)
    {
        this.name = other.getName();
        this.gender = other.getGender();
        this.age = other.getAge();
        this.cpf = other.getCpf();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.gender);
        hash = 41 * hash + this.age;
        hash = 41 * hash + Objects.hashCode(this.cpf);
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
        final Professor other = (Professor) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        return Objects.equals(this.cpf, other.cpf);
    }

    @Override
    public String toString() {
        return "Professor{" + "name=" + name + ", gender=" + gender + ", age=" + age + ", cpf=" + cpf + '}';
    }
}
