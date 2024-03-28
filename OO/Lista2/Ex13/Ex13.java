/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package myproject1.ex13;

import java.util.Scanner;
import myproject1.ex13.Classes.Manager;

/**
 *
 * @author marco
 */
public class Ex13 
{
    public static int options()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("1 - Add a Music");
        System.out.println("2 - Remove a Music");
        System.out.println("3 - Find a Music");
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
                    management.addMusic();
                    break;
                case 2:
                    System.out.println("Type the title: ");
                    String title = readLine.nextLine();
                    management.delMusic(title);
                    break;
                case 3:
                    System.out.println("Type the title: ");
                    title = readLine.nextLine();
                    management.delMusic(title);
                    break;
                case 4:
                    management.printMusicList();
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
