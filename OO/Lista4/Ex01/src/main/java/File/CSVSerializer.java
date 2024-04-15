/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.util.ArrayList;
import java.util.List;
import lista4.ex01.classes.Music;

/**
 *
 * @author marco
 */
public class CSVSerializer 
{
    public List<Music> fromCSV(String data)
    {
        List<Music> musics = new ArrayList<>();
        
        String[] line = data.split("\n");
        
        for(int i = 1;i < line.length;i++)
        {
            String[] part = line[i].split(";");
            if(part.length >= 4)
            {
                Music music = new Music();
                music.setTitle(part[0]);
                music.setSingerName(part[1]);
                music.setTime(part[2]);
                music.setPrice(Double.parseDouble(part[3]));
                
                musics.add(music);
            }
        }
        
        return musics;
    }
    
    public String toCSV(List<Music> musics)
    {
        String csv = "Title;Singer Name;Time;Price;\n";
        
        for(Music music : musics)
            csv += music.getTitle() + ";" 
                    + music.getSingerName() + ";" 
                    + music.getTime() + ";" 
                    + music.getPrice() + ";\n";
        return csv;
    }
}
