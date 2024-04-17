/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.ex02.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marco
 */
public class FilePersistence 
{
    public void saveToFile(String text, String filePath)
    {
        try
        {
            FileWriter file = new FileWriter(filePath);
            PrintWriter saveFile = new PrintWriter(file);
            saveFile.print(text);
            file.close();
        }
        catch (IOException ex)
        {
            Logger.getLogger(FilePersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String loadFromFile(String filePath)
    {
        String contentRead = "";
        try
        {
            File file = new File(filePath);
            Scanner readLine = new Scanner(file);
            readLine.useDelimiter("\\Z");
            while(readLine.hasNext())
                contentRead += readLine.nextLine();
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(FilePersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contentRead;
    }
}
