/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject1.ex13.Classes;

import java.util.Scanner;

/**
 *
 * @author 14731424666
 */
public class Music 
{
    private String title;
    private String artist;
    private double time;
    private double price;
    
    public Music()
    {
        this.title = "";
        this.artist = "";
        this.time = 0.0;
        this.price = 0.0;
    }
    
    public Music(Music other)
    {
        this.title = other.getTitle();
        this.artist = other.getArtist();
        this.time = other.getTime();
        this.price = other.getPrice();
    }
    
    public void playMusic() {
        System.out.println("The music "+ this.getTitle() + " is playing!");
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
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist the artist to set
     */
    public void setArtist(String artist) {
        this.artist = artist;
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
        
        System.out.println("Artist: ");
        this.artist = ler.next();
        
        System.out.println("Time: ");
        this.time = ler.nextDouble();
        
        System.out.println("Price: ");
        this.price = ler.nextDouble();
    }
    
    @Override
    public String toString()
    {
        return "Music {Title: " + this.title +
                ", Artist: " + this.artist + 
                ", Time: " + this.time +
                ", Price: " + this.price +
                "}";
    }
    
    public void copy(Music other)
    {
        this.title = other.getTitle();
        this.artist = other.getArtist();
        this.time = other.getTime();
        this.price = other.getPrice();
    }
    
    public void stopMusic()
    {
        System.out.println("The music " + this.title + " stopped.");
    }
}
