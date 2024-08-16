/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.ex09.Classes;

import trabalho.ex09.Interface.ILogSorage;

/**
 *
 * @author marco
 */
public class ConsoleLogStorage implements ILogSorage
{

    @Override
    public void file(String message) 
    {
        System.out.println(message);
    }
    
}
