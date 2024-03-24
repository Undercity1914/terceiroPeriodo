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
public class Aluno 
{
    private String name;
    private String gender;
    private int age;
    private Integer cpf;
    private String registration;
    private int yearEnter;

    public Aluno(String name, String gender, int age, Integer cpf, String registration, int yearEnter) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.cpf = cpf;
        this.registration = registration;
        this.yearEnter = yearEnter;
    }
    
    public Aluno()
    {
        this.name = "";
        this.gender = "";
        this.age = 0;
        this.cpf = 0;
        this.registration = "";
        this.yearEnter = 0;
    }
    
    public Aluno(Aluno other)
    {
        this.name = other.getName();
        this.gender = other.getGender();
        this.age = other.getAge();
        this.cpf = other.getCpf();
        this.registration = other.getRegistration();
        this.yearEnter = other.getYearEnter();
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

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getYearEnter() {
        return yearEnter;
    }

    public void setYearEnter(int yearEnter) {
        this.yearEnter = yearEnter;
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
        
        System.out.println("Registration: ");
        this.registration = readLine.nextLine();
        
        System.out.println("Year of entry: ");
        this.yearEnter = readLine.nextInt();
    }
    
    public void copy(Aluno other)
    {
        this.name = other.getName();
        this.gender = other.getGender();
        this.age = other.getAge();
        this.cpf = other.getCpf();
        this.registration = other.getRegistration();
        this.yearEnter = other.getYearEnter();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.gender);
        hash = 29 * hash + this.age;
        hash = 29 * hash + Objects.hashCode(this.cpf);
        hash = 29 * hash + Objects.hashCode(this.registration);
        hash = 29 * hash + this.yearEnter;
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
        final Aluno other = (Aluno) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.yearEnter != other.yearEnter) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.registration, other.registration)) {
            return false;
        }
        return Objects.equals(this.cpf, other.cpf);
    }

    @Override
    public String toString() {
        return "Aluno{" + "name=" + name + ", gender=" + gender + ", age=" + age + ", cpf=" + cpf + ", registration=" + registration + ", yearEnter=" + yearEnter + '}';
    }
}
