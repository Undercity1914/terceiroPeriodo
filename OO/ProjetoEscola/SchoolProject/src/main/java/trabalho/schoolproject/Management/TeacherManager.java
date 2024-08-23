/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.schoolproject.Management;

import file.filePersistence;
import file.serializadorCSVProf;
import java.util.ArrayList;
import java.util.List;
import trabalho.schoolproject.Classes.Person;
import trabalho.schoolproject.Classes.Teacher;

/**
 *
 * @author marco
 */
public class TeacherManager implements PersonManagement{
    private List<Teacher> teachers;

    public TeacherManager(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    public TeacherManager()
    {
        this.teachers = new ArrayList<>();
    }
    
    public List<Teacher> getTeachers()
    {
        return this.teachers;
    }
   
    @Override
    public Person find(Integer cpf) {
        for(Teacher teacher : teachers)
            if(teacher.getCpf().equals(cpf))
                return teacher;
        
        return null;
    }

    @Override
    public void add(Person newPerson) {
        if(newPerson instanceof Teacher)
            teachers.add((Teacher) newPerson);
        else
            throw new IllegalArgumentException("Error! The person have to be a teacher.");
    }

    @Override
    public void update(Integer cpf, Person newPerson) {
        if(!(newPerson instanceof Teacher))
            throw new IllegalArgumentException("ERROR! New person is not instantiate.");
        
        Person teacher = this.find(cpf);
        
        if(teacher != null)
        {
             int index = this.teachers.indexOf(teacher);
             teachers.set(index, (Teacher) newPerson);
             System.out.println("Teacher list is up to date.");
        }
    }

    @Override
    public void remove(Integer cpf) {
        teachers.remove(this.find(cpf));
    }
    
    @Override
    public void salvarNoArquivo(String caminhoDoArquivo) {
        serializadorCSVProf serializador = new serializadorCSVProf();
        String csvData = serializador.toCSV(this.teachers);

        filePersistence filePersistence = new filePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Professores salvos em " + caminhoDoArquivo);
    }
    
    @Override
    public void carregarDoArquivo(String caminhoDoArquivo) {
        filePersistence FilePersistence = new filePersistence();
        String csvData = FilePersistence.loadFromFile(caminhoDoArquivo);

        serializadorCSVProf serializador = new serializadorCSVProf();
        this.teachers = serializador.fromCSV(csvData);

        System.out.println("Professores carregados de " + caminhoDoArquivo);
    }
}
