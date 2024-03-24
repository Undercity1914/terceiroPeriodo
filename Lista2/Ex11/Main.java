/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package myproject1.ex01a10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import myproject1.ex01a10.classes.Livro;

/**
 *
 * @author marco
 */
public class Main 
{
    
    public static int printMenu()
    {
        Scanner readLine = new Scanner(System.in);
        System.out.println("-------------Hello, Dear!--------------");
        
        System.out.println("1 - Insert a Book");
        System.out.println("2 - Remove a Book");
        System.out.println("3 - Insert a Lot of Book");
        System.out.println("4 - Search by Title");
        System.out.println("5 - Search by Author");
        System.out.println("0 - Exit");
        
        System.out.print("Choose the some number above: ");
        return readLine.nextInt();
    }

    public static void main(String[] args) 
    {
       List<Livro> livros;
       livros = new ArrayList<Livro>();
       
       Scanner readLine = new Scanner(System.in);
       
       int option;
       
       do{
           option = printMenu();
           
           if(option == 1)
           {
               Livro l = new Livro();
               l.fill();
               livros.add(l);
               System.out.println("Filed!");
           }
           
           else if(option == 2)
           {
               int size = livros.size();
               System.out.print("Type the title: ");
               String title = readLine.nextLine();
               for(int i = 0;i < size;i++)
               {
                   Livro l = livros.get(i);
                   if(title.equals(l.getTitulo()))
                   {
                       livros.remove(l);
                       
                       System.out.println("Removed!");
                       
                       i = size;
                   }
               }
           }
           
           else if(option == 3)
           {
               System.out.println("Type how much books do you want to file: ");
               int size = readLine.nextInt();
               
               for(int i = 0; i < size; i++)
               {
                    Livro l = new Livro();
                    l.fill();
                    livros.add(l);
                    System.out.println("Filed!");
               }
           }
           
           else if(option == 4)
           {
               int size = livros.size();
               System.out.print("Type the title: ");
               String title = readLine.nextLine();
               for(int i = 0;i < size;i++)
               {
                   Livro l = livros.get(i);
                   if(title.equals(l.getTitulo()))
                   {
                       System.out.println(l);
                       
                       i = size;
                   }
               }
           }
           
           else if(option == 5)
           {
               int size = livros.size();
               System.out.print("Type the title: ");
               String title = readLine.nextLine();
               for(int i = 0;i < size;i++)
               {
                   Livro l = livros.get(i);
                   if(title.equals(l.getAutor()))
                   {
                       System.out.println(l);
                       
                       i = size;
                   }
               }               
           }
       }while(option != 0);
       
        System.out.println("Thanks for using our Software! Have a good day, bye!!!");
    }
}
