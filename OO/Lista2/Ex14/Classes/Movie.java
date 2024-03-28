/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject1.ex14.Classes;

import java.util.Scanner;

/**
 *
 * @author 14731424666
 */
public class Movie 
{
    private String title;
    private String manager;
    private double time;
    private double price;
    
    public Movie()
    {
        this.title = "";
        this.manager = "";
        this.time = 0.0;
        this.price = 0.0;
    }
    
    public Movie(Movie other)
    {
        this.title = other.getTitle();
        this.manager = other.getManager();
        this.time = other.getTime();
        this.price = other.getPrice();
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * @param manager the manager to set
     */
    public void setManager(String manager) {
        this.manager = manager;
    }

    /**
     * @return the time
     */
    public double getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(double time) {
        this.time = time;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void fill()
    {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Title: ");
        this.title = ler.next();
        
        System.out.println("Manager: ");
        this.manager = ler.next();
        
        System.out.println("Time: ");
        this.time = ler.nextDouble();
        
        System.out.println("Price: ");
        this.price = ler.nextDouble();
    }
    
    @Override
    public String toString()
    {
        return "Movie {Title: " + this.title +
                ", Manager: " + this.manager + 
                ", Time: " + this.time +
                ", Price: " + this.price +
                "}";
    }
    
    public void copy(Movie other)
    {
        this.title = other.getTitle();
        this.manager = other.getManager();
        this.time = other.getTime();
        this.price = other.getPrice();
    }
}
