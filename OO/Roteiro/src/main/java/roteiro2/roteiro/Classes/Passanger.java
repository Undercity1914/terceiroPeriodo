/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro2.roteiro.Classes;

import java.util.Objects;

/**
 *
 * @author marco
 */
public class Passanger 
{
    private String name;
    private String cpf;
    private Loyalty points;
    
    public Passanger()
    {
        this.name = "";
        this.cpf = "";
        this.points = new Loyalty();
    }

    public Passanger(String name, String cpf, Loyalty points) {
        this.name = name;
        this.cpf = cpf;
        this.points = points;
    }
    
    public Passanger(Passanger other)
    {
        this.name = other.getName();
        this.cpf = other.getCpf();
        this.points = other.getPoints();
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
    
    public Loyalty getPoints()
    {
        return this.points;
    }
    
    public void setPoints(Loyalty points)
    {
        this.points = points;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.cpf);
        hash = 97 * hash + Objects.hashCode(this.points);
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
        final Passanger other = (Passanger) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.points, other.points);
    }

    @Override
    public String toString() {
        return "Passanger{" + "name=" + name + ", cpf=" + cpf + ", points=" + points + '}';
    }
}
