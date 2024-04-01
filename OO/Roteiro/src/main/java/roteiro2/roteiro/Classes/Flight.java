/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro2.roteiro.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author marco
 */
public class Flight 
{
    private Integer number;
    private String destination;
    private Integer passangerCapacity;
    private List<Passanger> passanger;
    private List<Airport> scale;
    private String status;
    
    public Flight()
    {
        this.number = 0;
        this.destination = "";
        this.passangerCapacity = 0;
        this.passanger = new ArrayList<>();
        this.scale = new ArrayList<>();
        this.status = "";
    }

    public Flight(Integer number, String destination, Integer passangerCapacity, List<Passanger> passanger, List<Airport> scale, String status) {
        this.number = number;
        this.destination = destination;
        this.passangerCapacity = passangerCapacity;
        this.passanger = passanger;
        this.scale = scale;
        this.status = status;
    }
    
    public Flight(Flight other)
    {
        this.number = other.getNumber();
        this.destination = other.getDestination();
        this.passangerCapacity = other.getPassangerCapacity();
        this.passanger = other.getPassanger();
        this.scale = other.getScale();
        this.status = other.getStatus();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getPassangerCapacity() {
        return passangerCapacity;
    }

    public void setPassangerCapacity(Integer passangerCapacity) {
        this.passangerCapacity = passangerCapacity;
    }

    public List<Passanger> getPassanger() {
        return passanger;
    }

    public void setPassanger(List<Passanger> passanger) {
        this.passanger = passanger;
    }

    public List<Airport> getScale() {
        return scale;
    }

    public void setScale(List<Airport> scale) {
        this.scale = scale;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void removePassanger(String cpf)
    {
        int size;
        size = this.passanger.size();
        
        for(int i = 0;i < size;i++)
        {
            Passanger p = this.passanger.get(i);
            if(p.getCpf().equals(cpf))
            {
                passanger.remove(p);
                i = size;
            }
        }
    }
    
    public void addPassanger(Passanger p)
    {
        passanger.add(p);
    }
    
    public void addScale(Airport airport)
    {
        scale.add(airport);
    }
    
    public void removeScale(String name)
    {
        int size;
        size = this.scale.size();
        
        for(int i = 0;i < size;i++)
        {
            Airport a = this.scale.get(i);
            if(a.getName().equals(name))
            {
                this.scale.remove(a);
                i = size;
            }
        }
    }

    @Override
    public String toString() {
        return "Flight{" + "number=" + number + ", destination=" + destination + ", passangerCapacity=" + passangerCapacity + ", passanger=" + passanger + ", scale=" + scale + ", status=" + status + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.number);
        hash = 29 * hash + Objects.hashCode(this.destination);
        hash = 29 * hash + Objects.hashCode(this.passangerCapacity);
        hash = 29 * hash + Objects.hashCode(this.passanger);
        hash = 29 * hash + Objects.hashCode(this.scale);
        hash = 29 * hash + Objects.hashCode(this.status);
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
        final Flight other = (Flight) obj;
        if (!Objects.equals(this.destination, other.destination)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.number, other.number)) {
            return false;
        }
        if (!Objects.equals(this.passangerCapacity, other.passangerCapacity)) {
            return false;
        }
        if (!Objects.equals(this.passanger, other.passanger)) {
            return false;
        }
        return Objects.equals(this.scale, other.scale);
    }
}
