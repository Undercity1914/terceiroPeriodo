/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.schoolproject.Management;

import file.filePersistence;
import file.serializadorCSValuno;
import java.util.ArrayList;
import java.util.List;
import trabalho.schoolproject.Classes.Person;
import trabalho.schoolproject.Classes.Student;

/**
 *
 * @author marco
 */
public class StudentManager implements PersonManagement{
    
    private List<Student> students;

    public StudentManager(List<Student> students) {
        this.students = students;
    }
    
    public StudentManager()
    {
        this.students = new ArrayList<>();
    }
    
    public List<Student> getStudents()
    {
        return this.students;
    }

    @Override
    public Person find(Integer cpf) {
        for(Student student : students)
            if(student.getCpf().equals(cpf))
                return student;
        
        return null;
    }

    @Override
    public void add(Person newPerson) {
        if(newPerson instanceof Student)
            students.add((Student) newPerson);
        else
            throw new IllegalArgumentException("Error! The person have to be a Student.");
    }

    @Override
    public void update(Integer cpf, Person newPerson) {
        if(!(newPerson instanceof Student))
            throw new IllegalArgumentException("ERROR! New person is not instantiate.");
        
        Person student = this.find(cpf);
        
        if(student != null)
        {
             int index = this.students.indexOf(student);
             students.set(index, (Student) newPerson);
             System.out.println("Student list is up to date.");
        }
        
    }

    @Override
    public void remove(Integer cpf) {
        students.remove(this.find(cpf));
    }
    
    @Override
     public void salvarNoArquivo(String caminhoDoArquivo) {
        serializadorCSValuno serializador = new serializadorCSValuno();
        String csvData = serializador.toCSV(this.students);

        filePersistence filePersistence = new filePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Alunos salvos  em " + caminhoDoArquivo);
    }
     
     @Override
    public void carregarDoArquivo(String caminhoDoArquivo) {
        filePersistence FilePersistence = new filePersistence();
        String csvData = FilePersistence.loadFromFile(caminhoDoArquivo);

        serializadorCSValuno serializador = new serializadorCSValuno();
        this.students = serializador.fromCSV(csvData);

        System.out.println("Alunos carregados de " + caminhoDoArquivo);
    }
}
