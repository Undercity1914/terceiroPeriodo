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
public class Accont 
{
    private Integer number;
    private double balance;
    private int password;
    
    public Accont()
    {
        this.number = 0;
        this.balance = 0.0;
        this.password = 0;
    }

    public Accont(Integer number, double balance, int password) {
        this.number = number;
        this.balance = balance;
        this.password = password;
    }
    
    public Accont(Accont other)
    {
        this.number = other.getNumber();
        this.balance = other.getBalance();
        this.password = other.getPassword();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    public void fill()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Accont number: ");
        this.number = readLine.nextInt();
        
        System.out.println("Password: ");
        this.password = readLine.nextInt();
    }
    
    public void copy(Accont other)
    {
        this.number = other.getNumber();
        this.balance = other.getBalance();
        this.password = other.getPassword();
    }
    
    public void deposit()
    {
        int c;
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Enter the quantity:");
        c = readLine.nextInt();
        this.balance += c;
    }
    
    public void withdraw()
    {
        int c;
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Enter the quantity:");
        c = readLine.nextInt();
        
        this.balance -= c;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.number);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.balance) ^ (Double.doubleToLongBits(this.balance) >>> 32));
        hash = 37 * hash + this.password;
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
        final Accont other = (Accont) obj;
        if (Double.doubleToLongBits(this.balance) != Double.doubleToLongBits(other.balance)) {
            return false;
        }
        if (this.password != other.password) {
            return false;
        }
        return Objects.equals(this.number, other.number);
    }

    @Override
    public String toString() {
        return "Accont{" + "number=" + number + ", balance=" + balance + ", password=" + password + '}';
    }
}
