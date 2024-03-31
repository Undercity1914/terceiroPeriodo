/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro2.roteiro.Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marco
 */
public class Airport 
{
    private String name;
    private String local;
    private List<Flight> flight;
    
    public Airport()
    {
        this.name = "";
        this.local = "";
        this.flight = new ArrayList<>();
    }

    public Airport(String name, String local, List<Flight> flight) {
        this.name = name;
        this.local = local;
        this.flight = flight;
    }
    
    public Airport(Airport other)
    {
        this.name = other.getName();
        this.local = other.getLocal();
        this.flight = other.getFlight();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Flight> getFlight() {
        return flight;
    }

    public void setFlight(List<Flight> flight) {
        this.flight = flight;
    }
    
    public void addFlight(Flight f)
    {
        this.flight.add(f);
    }
    
    public void removeFlight(Integer number)
    {
        int size;
        size = this.flight.size();
        
        for(int i = 0;i < size;i++)
        {
            Flight f = this.flight.get(i);
            if(f.getNumber().equals(number))
            {
                this.flight.remove(f);
                i = size;
            }
        }
    }
    
    public void prejudice()
    {
        int size;
        size = this.flight.size();
        
        for(int i = 0;i < size;i++)
        {
            Flight f = this.flight.get(i);
            List<Passanger> p = f.getPassanger();
            if(p.size() == 0)
            {
                System.out.println("Empty! Removing");
                this.removeFlight(f.getNumber());
            }
            else
                System.out.println("everything is going well on the flight " + f.getNumber() + ".");
        }
    }
}
