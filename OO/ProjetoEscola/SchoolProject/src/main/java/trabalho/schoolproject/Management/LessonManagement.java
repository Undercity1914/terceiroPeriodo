/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.schoolproject.Management;

import file.filePersistence;
import file.serializadorCSVDisciplina;
import java.util.ArrayList;
import java.util.List;
import trabalho.schoolproject.Classes.Lesson;

/**
 *
 * @author marco
 */
public class LessonManagement 
{
    private List<Lesson> lessons;

    public LessonManagement(List<Lesson> lessons) {
        this.lessons = lessons;
    }
    
    public List<Lesson> getLessons()
    {
        return this.lessons;
    }
    
    public LessonManagement()
    {
        this.lessons = new ArrayList<>();
    }
    
    public Lesson find(String name)
    {
        for(Lesson lesson : this.lessons)
            if(lesson.getName().equals(name))
                return lesson;
        
        return null;
    }
    
    public void add(Lesson newLesson)
    {
        lessons.add(newLesson);
    }
    
    public void remove(String name)
    {
        lessons.remove(find(name));
    }
    
    public void update(String name, Lesson newLesson)
    {
        Lesson lesson = find(name);
        
        if(lesson != null)
        {
            int index = lessons.indexOf(lesson);
            lessons.set(index, newLesson);
        }
    }
    
    public void salvarNoArquivo(String caminhoDoArquivo) {
        serializadorCSVDisciplina serializador = new serializadorCSVDisciplina();
        String csvData = serializador.toCSV(lessons);

        filePersistence filePersistence = new filePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Disciplina salva em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        filePersistence FilePersistence = new filePersistence();
        String csvData = FilePersistence.loadFromFile(caminhoDoArquivo);

        serializadorCSVDisciplina serializador = new serializadorCSVDisciplina();
        this.lessons = serializador.fromCSV(csvData);

        System.out.println("Disciplinas carregados de " + caminhoDoArquivo);
    }
}
