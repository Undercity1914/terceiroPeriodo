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
public class Phone 
{
    private int ddd;
    private Integer number;
    private String description;
    private String operator;
    
    public Phone()
    {
        this.ddd = 0;
        this.number = 0;
        this.description = "";
        this.operator = "";
    }

    public Phone(int ddd, Integer number, String description, String operator) {
        this.ddd = ddd;
        this.number = number;
        this.description = description;
        this.operator = operator;
    }
    
    public Phone(Phone other)
    {
        this.ddd = other.getDdd();
        this.number = other.getNumber();
        this.description = other.getDescription();
        this.operator = other.getOperator();
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    public void fill()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("DDD:");
        this.ddd = readLine.nextInt();
        
        System.out.println("Phone number: ");
        this.number = readLine.nextInt();
        
        System.out.println("Description of number:");
        this.description = readLine.nextLine();
        
        System.out.println("Mobile Operator: ");
        this.operator = readLine.nextLine();
    }
    
    public void copy(Phone other)
    {
        this.ddd = other.getDdd();
        this.number = other.getNumber();
        this.description = other.getDescription();
        this.operator = other.getOperator();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.ddd;
        hash = 19 * hash + Objects.hashCode(this.number);
        hash = 19 * hash + Objects.hashCode(this.description);
        hash = 19 * hash + Objects.hashCode(this.operator);
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
        final Phone other = (Phone) obj;
        if (this.ddd != other.ddd) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.operator, other.operator)) {
            return false;
        }
        return Objects.equals(this.number, other.number);
    }

    @Override
    public String toString() {
        return "Phone{" + "ddd=" + ddd + ", number=" + number + ", description=" + description + ", operator=" + operator + '}';
    }
}
