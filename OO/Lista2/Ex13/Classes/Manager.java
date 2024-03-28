/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject1.ex13.Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marco
 */
public class Manager 
{
    private List<Music> musics;
    public Manager()
    {
        this.musics = new ArrayList<Music>();
    }
    
    public void delMusic(String title)
    {
        int size = musics.size();
        for(int i = 0; i < size; i++)
        {
            Music m = musics.get(i);
            if(title.equals(m.getTitle()))
            {
                musics.remove(m);
                System.out.println("Removed!");
                i = size;
            }
        }
    }
    
    public void addMusic()
    {
        Music m = new Music();
        m.fill();
        musics.add(m);
        System.out.println("Filed!");
    }
    
    public void findMusic(Music title)
    {
        int size = musics.size();
        for(int i = 0; i < size; i++)
        {
            Music m = musics.get(i);
            if(title.equals(m.getTitle()))
            {
                System.out.println(m);
                i = size;
            }
        }
    }
    
    public void printMusicList()
    {
        for(int i = 0; i < musics.size(); i++)
        {
            Music m = musics.get(i);
            System.out.println(m);
        }
    }
}
