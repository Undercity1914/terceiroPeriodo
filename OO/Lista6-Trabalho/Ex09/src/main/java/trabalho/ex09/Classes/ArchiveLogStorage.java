/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.ex09.Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import trabalho.ex09.Interface.ILogSorage;

/**
 *
 * @author marco
 */
public class ArchiveLogStorage implements ILogSorage
{

    @Override
    public void file(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) 
        {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
    
}
