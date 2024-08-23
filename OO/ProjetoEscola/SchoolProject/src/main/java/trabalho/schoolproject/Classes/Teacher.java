/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.schoolproject.Classes;

import java.util.Objects;

/**
 *
 * @author marco
 */
public class Teacher extends Person
{
    private String sex;    

    public Teacher(String sex, String name, Integer age, Integer cpf) {
        super(name, age, cpf);
        this.sex = sex;
    }

    public Teacher(String sex) {
        this.sex = sex;
    }

    public Teacher(String sex, Person other) {
        super(other);
        this.sex = sex;
    }
    
    public Teacher()
    {
        super();
        this.sex = "";
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Integer getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.sex);
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
        final Teacher other = (Teacher) obj;
        return Objects.equals(this.sex, other.sex);
    }

    @Override
    public String toString() {
        return "Teacher{" + "sex=" + sex + '}';
    }
}
