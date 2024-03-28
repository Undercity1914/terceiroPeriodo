/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.ex08.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Performer 
{
    private String name;
    private List<Album> album;
    
    public Performer()
    {
        this.name = "";
        this.album = new ArrayList<>();
    }

    public Performer(String name, List<Album> album) {
        this.name = name;
        this.album = album;
    }
    
    public Performer(Performer other)
    {
        this.name = other.getName();
        this.album = other.getAlbum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbum() {
        return album;
    }

    public void setAlbum(List<Album> album) {
        this.album = album;
    }
    
    public void fill()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Name: ");
        this.name = readLine.nextLine();
    }
    
    public void addAlbum()
    {
        Scanner readLine = new Scanner(System.in);
        int c;
        Album a = new Album();
        System.out.println("How many albuns u wanna add? ");
        c = readLine.nextInt();
        
        for(int i = 0;i < c;i++)
        {
            a.fill();
            this.album.add(a);
        }
    }
    
    public void addMusic()
    {
        Scanner readLine = new Scanner(System.in);
        String c;
        //Music m = new Music();
        //m.fill();
        Album a = new Album();
        System.out.println("Type the album name: ");
        c = readLine.nextLine();
        
        int size;
        size = this.album.size();
        
        for(int i = 0;i < size;i++)
        {
            a = album.get(i);
            if(a.getName().equals(c))
                a.addMusic();
        }
    }
}
