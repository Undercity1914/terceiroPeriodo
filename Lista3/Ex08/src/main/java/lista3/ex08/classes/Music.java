/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.ex08.classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Music 
{
    private String title;
    private String time;
    
    public Music()
    {
        this.title = "";
        this.time = "";
    }

    public Music(String title, String time) {
        this.title = title;
        this.time = time;
    }
    
    public Music(Music other)
    {
        this.title = other.getTitle();
        this.time = other.getTime();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public void fill()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Title:");
        this.title = readLine.nextLine();
        
        System.out.println("Song duration: ");
        this.time = readLine.nextLine();
    }
    
    public void copy(Music other)
    {
        this.title = other.getTitle();
        this.time = other.getTime();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.title);
        hash = 89 * hash + Objects.hashCode(this.time);
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
        final Music other = (Music) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return Objects.equals(this.time, other.time);
    }

    @Override
    public String toString() {
        return "Music{" + "title=" + title + ", time=" + time + '}';
    }
}
