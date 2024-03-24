/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject1.ex14.Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marco
 */
public class Manager 
{
    private List<Movie> movies;
    
    public Manager()
    {
        this.movies = new ArrayList<Movie>();
    }
    
    public void delMovie(String title)
    {
        int size = movies.size();
        for(int i = 0; i < size; i++)
        {
            Movie m = movies.get(i);
            if(title.equals(m.getTitle()))
            {
                movies.remove(m);
                System.out.println("Removed!");
                i = size;
            }
        }
    }
    
    public void addMovie()
    {
        Movie m = new Movie();
        m.fill();
        movies.add(m);
        System.out.println("Filed!");
    }
    
    public void findMovie(Movie title)
    {
        int size = movies.size();
        for(int i = 0; i < size; i++)
        {
            Movie m = movies.get(i);
            if(title.equals(m.getTitle()))
            {
                System.out.println(m);
                i = size;
            }
        }
    }
    
    public void printMovieList()
    {
        for(int i = 0; i < movies.size(); i++)
        {
            Movie m = movies.get(i);
            System.out.println(m);
        }
    }
}
