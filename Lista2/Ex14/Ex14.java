/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package myproject1.ex14;

import java.util.Scanner;
import myproject1.ex14.Classes.Manager;

/**
 *
 * @author marco
 */
public class Ex14 
{
    public static int options()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("1 - Add a Movie");
        System.out.println("2 - Remove a Movie");
        System.out.println("3 - Find a Movie");
        System.out.println("4 - Show your list");
        System.out.println("0 - Left");
        
        System.out.println("Choose some number above: ");
        return readLine.nextInt();
    }

    public static void main(String[] args) 
    {
        Scanner readLine = new Scanner(System.in);
        
        Manager management = new Manager();
       
        int option;
        
        do{
            option = options();
            
            switch(option)
            {
                case 1:
                    management.addMovie();
                    break;
                case 2:
                    System.out.println("Type the title: ");
                    String title = readLine.nextLine();
                    management.delMovie(title);
                    break;
                case 3:
                    System.out.println("Type the title: ");
                    title = readLine.nextLine();
                    management.delMovie(title);
                    break;
                case 4:
                    management.printMovieList();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ERRO 404: Number not found! Try again.");
                    break;
            }
            
        }while(option != 0);
    }
}
