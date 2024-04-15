/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.ex01.classes;

import java.util.Objects;

/**
 *
 * @author marco
 */
public class Person 
{
    private String name;
    private String cpf;
    private int age;
    private String sex;
    
    public Person()
    {
        this.name = "";
        this.cpf = "";
        this.age = 0;
        this.sex = "";
    }

    public Person(String name, String cpf, int age, String sex) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
        this.sex = sex;
    }
    
    public Person(Person other)
    {
        this.name = other.getName();
        this.cpf = other.getCpf();
        this.age = other.getAge();
        this.sex = other.getSex();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public void copy(Person other)
    {
        this.name = other.getName();
        this.cpf = other.getCpf();
        this.age = other.getAge();
        this.sex = other.getSex();
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", cpf=" + cpf + ", age=" + age + ", sex=" + sex + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.cpf);
        hash = 79 * hash + this.age;
        hash = 79 * hash + Objects.hashCode(this.sex);
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
        final Person other = (Person) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.sex, other.sex);
    }
}
