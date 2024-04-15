/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.ex01.classes;

import java.util.Objects;

/**
 *
 * @author marco
 */
public class Music 
{
    private String title;
    private String singerName;
    private String time;
    private Double price;
    
    public Music()
    {
        this.title = "";
        this.singerName = "";
        this.time = "";
        this.price = 0.0;
    }

    public Music(String title, String singerName, String time, Double price) {
        this.title = title;
        this.singerName = singerName;
        this.time = time;
        this.price = price;
    }
    
    public Music(Music other)
    {
        this.title = other.getTitle();
        this.singerName = other.getSingerName();
        this.time = other.getTime();
        this.price = other.getPrice();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public void copy(Music other)
    {
        this.title = other.getTitle();
        this.singerName = other.getSingerName();
        this.time = other.getTime();
        this.price = other.getPrice();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.title);
        hash = 53 * hash + Objects.hashCode(this.singerName);
        hash = 53 * hash + Objects.hashCode(this.time);
        hash = 53 * hash + Objects.hashCode(this.price);
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
        if (!Objects.equals(this.singerName, other.singerName)) {
            return false;
        }
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        return Objects.equals(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Music{" + "title=" + title + ", singerName=" + singerName + ", time=" + time + ", price=" + price + '}';
    }
}
