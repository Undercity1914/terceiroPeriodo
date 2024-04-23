/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Classes.Music;
import File.FilePersistence;
import File.XMLSerializer;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marco
 */

@XmlRootElement(name = "Musics")
public class MusicManagement 
{
    @XmlElement(name = "Music")
    private List<Music> musics;
    
    public MusicManagement()
    {
        this.musics = new ArrayList<>();
    }
    
    public void addMusic(Music music)
    {
        this.musics.add(music);
        System.out.println("Filed!");
    }
    
    public void removeMusic(String title)
    {
        Music music = new Music();
        
        int size = this.musics.size();
        
        for(int i = 0;i < size;i++)
        {
            music = this.musics.get(i);
            if(music.getTitle().equals(title))
            {
                this.musics.remove(music);
                i = size;
            }
        }
    }
    
    public Music findMusic(String title)
    {
        Music music = new Music();
        
        int size = this.musics.size();
        
        for(int i = 0;i < size;i++)
        {
            music = this.musics.get(i);
            if(music.getTitle().equals(title))
                return music;
        }
        
        return null;
    }
    
    public void updateMusic(String oldtitle, Music newMusic)
    {
        Music music = this.findMusic(oldtitle);
        if(music != null)
        {
            int index = this.musics.indexOf(music);
            this.musics.set(index, newMusic);
        }
    }
    
    @Override
    public String toString() {
        StringBuilder print = new StringBuilder();
        for(Music music : this.musics)
            print.append(music.toString()).append("\n");
        
        return print.toString();
    }
    
    public void saveToFile(String pathFile)
    {
        XMLSerializer serializer = new XMLSerializer();
        String csvData = serializer.toXML(this);
        
        FilePersistence filePersistence = new FilePersistence();
        
        filePersistence.saveToFile(csvData, pathFile);
    }
    
    public void loadFromFile(String pathFile)
    {
        FilePersistence filePersistence = new FilePersistence();
        String xmlData = filePersistence.loadFromFile(pathFile);
        
        XMLSerializer serializer = new XMLSerializer();
        this.musics = serializer.fromXML(xmlData).musics;
    }
}
