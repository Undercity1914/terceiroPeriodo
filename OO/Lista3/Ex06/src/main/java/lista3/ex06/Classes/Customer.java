/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.ex06.Classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Customer 
{
    private String name;
    private Integer cpf;
    private Accont accont;
    
    public Customer()
    {
        this.name = "";
        this.cpf = 0;
        this.accont = new Accont();
    }

    public Customer(String name, Integer cpf, Accont accont) {
        this.name = name;
        this.cpf = cpf;
        this.accont = new Accont(accont);
    }
    
    public Customer(Customer other)
    {
        this.name = other.getName();
        this.cpf = other.getCpf();
        this.accont = other.getAccont();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Accont getAccont() {
        return accont;
    }

    public void setAccont(Accont accont) {
        this.accont = accont;
    }
    
    public void fill()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Name: ");
        this.name = readLine.nextLine();
        
        System.out.println("CPF: ");
        this.cpf = readLine.nextInt();
        
        this.accont.fill();
    }
    
    public void copy(Customer other)
    {
        this.name = other.getName();
        this.cpf = other.getCpf();
        this.accont = other.getAccont();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.cpf);
        hash = 97 * hash + Objects.hashCode(this.accont);
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
        final Customer other = (Customer) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.accont, other.accont);
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", cpf=" + cpf + ", accont=" + accont + '}';
    }
    
    public void depositOrWithdraw()
    {
        int option;
        Scanner readLine = new Scanner(System.in);
        System.out.println("1-Deposit"
                + "2-Withdraw");
        System.out.println("Choose a number");
        option = readLine.nextInt();
        
        if(option == 1)
            this.accont.deposit();
        else
            this.accont.withdraw();
    }
}
