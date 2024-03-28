/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.ex07.Classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Cliente 
{
    private String name;
    private Integer cpf;
    private String address;
    
    public Cliente()
    {
        this.name = "";
        this.cpf = 0;
        this.address = "";
    }

    public Cliente(String name, Integer cpf, String address) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
    }
    
    public Cliente(Cliente other)
    {
        this.name = other.getName();
        this.cpf = other.getCpf();
        this.address = other.getAddress();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void fill()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Name: ");
        this.name = readLine.nextLine();
        
        System.out.println("CPF: ");
        this.cpf = readLine.nextInt();
        
        System.out.println("Address: ");
        this.address = readLine.nextLine();
    }
    
    public void copy(Cliente other)
    {
        this.name = other.getName();
        this.cpf = other.getCpf();
        this.address = other.getAddress();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.cpf);
        hash = 23 * hash + Objects.hashCode(this.address);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return Objects.equals(this.cpf, other.cpf);
    }

    @Override
    public String toString() {
        return "Cliente{" + "name=" + name + ", cpf=" + cpf + ", address=" + address + '}';
    }
}
