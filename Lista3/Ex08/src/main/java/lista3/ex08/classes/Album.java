/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.ex08.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Album 
{
    private String name;
    private int year;
    private List<Music> musics;
    
    public Album()
    {
        this.name = "";
        this.year = 0;
        this.musics = new ArrayList<Music>();
    }

    public Album(String name, int year, List<Music> musics) {
        this.name = name;
        this.year = year;
        this.musics = musics;
    }
    
    public Album(Album other)
    {
        this.name = other.getName();
        this.year = other.getYear();
        this.musics = other.getMusics();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }
    
    public void fill()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Album name:");
        this.name = readLine.nextLine();
        
        System.out.println("Release Year: ");
        this.year = readLine.nextInt();
    }
    
    public void addMusic()
    {
        Music m = new Music();
        int c;
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("How many songs: ");
        c = readLine.nextInt();
        
        for(int i = 0;i < c;i++)
        {
            m.fill();
            this.musics.add(m);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + this.year;
        hash = 23 * hash + Objects.hashCode(this.musics);
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
        final Album other = (Album) obj;
        if (this.year != other.year) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.musics, other.musics);
    }

    @Override
    public String toString() {
        return "Album{" + "name=" + name + ", year=" + year + ", musics=" + musics + '}';
    }
}
