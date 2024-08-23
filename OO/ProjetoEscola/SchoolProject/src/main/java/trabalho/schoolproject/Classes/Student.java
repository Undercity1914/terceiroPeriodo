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
public class Student extends Person
{
    private Integer register;
    private Integer yearIn;

    public Student(Integer register, Integer yearIn, String name, Integer age, Integer cpf) {
        super(name, age, cpf);
        this.register = register;
        this.yearIn = yearIn;
    }

    public Student(Integer register, Integer yearIn) {
        this.register = register;
        this.yearIn = yearIn;
    }

    public Student(Integer register, Integer yearIn, Person other) {
        super(other);
        this.register = register;
        this.yearIn = yearIn;
    }
    
    public Student()
    {
        super();
        this.register = 0;
        this.yearIn = 0;
    }

    @Override
    public String toString() {
        return "Student{" + "register=" + register + ", yearIn=" + yearIn + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.register);
        hash = 47 * hash + Objects.hashCode(this.yearIn);
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
        final Student other = (Student) obj;
        if (!Objects.equals(this.register, other.register)) {
            return false;
        }
        return Objects.equals(this.yearIn, other.yearIn);
    }

    public Integer getRegister() {
        return register;
    }

    public void setRegister(Integer register) {
        this.register = register;
    }

    public Integer getYearIn() {
        return yearIn;
    }

    public void setYearIn(Integer yearIn) {
        this.yearIn = yearIn;
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
}
