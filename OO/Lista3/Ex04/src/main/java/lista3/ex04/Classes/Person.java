/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.ex04.Classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author 14731424666
 */
public class Person 
{
    private String name;
    private Integer CPF;
    private String email;
    private Contas bill;
    
    public Person()
    {
        this.name = "";
        this.CPF = 0;
        this.email = "";
        this.bill = new Contas();
    }
    
    public Person(String name, Integer CPF, String email, Contas bill) 
    {
        this.name = name;
        this.CPF = CPF;
        this.email = email;
        this.bill = new Contas(bill);
    }
    
    public Person(Person other)
    {
        this.name = other.getName();
        this.CPF = other.getCPF();
        this.email = other.getEmail();
        this.bill = other.getBill();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the CPF
     */
    public Integer getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(Integer CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
        
        this.bill.fill();
    }
    
    public void copy(Person other)
    {
        this.name = other.getName();
        this.CPF = other.getCPF();
        this.email = other.getEmail();
    }

    /**
     * @return the bill
     */
    public Contas getBill() {
        return bill;
    }

    /**
     * @param bill the bill to set
     */
    public void setBill(Contas bill) {
        this.bill = bill;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.CPF);
        hash = 97 * hash + Objects.hashCode(this.email);
        hash = 97 * hash + Objects.hashCode(this.bill);
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        return Objects.equals(this.bill, other.bill);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name
                + ", CPF=" + CPF
                + ", email=" + email
                + ", bill=" + bill
                + '}';
    }
}
