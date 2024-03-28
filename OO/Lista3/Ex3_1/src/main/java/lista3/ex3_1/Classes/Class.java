/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.ex3_1.Classes;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Class 
{
    private String name;
    private String semester;
    private String timetable;
    private Aluno[] studants;
    private Professor professor;
    
    public Class()
    {
        this.name = "";
        this.semester = "";
        this.timetable = "";
        this.studants = new Aluno[30];
        for(int i = 0;i < 30;i++)
            this.studants[i] = new Aluno();
        this.professor = new Professor();
    }

    public Class(String name, String semester, String timetable, Professor professor, Aluno[] studant) {
        this.name = name;
        this.semester = semester;
        this.timetable = timetable;
        this.professor = professor;
        this.studants = new Aluno[30];
        for(int i = 0;i < 30;i++)
            this.studants[i] = new Aluno(studant[i]);
    }
    
    public Class(Class other)
    {
        this.name = other.getName();
        this.semester = other.getSemester();
        this.timetable = other.getTimetable();
        this.studants = other.getStudants();
        this.professor = other.getProfessor();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getTimetable() {
        return timetable;
    }

    public void setTimetable(String timetable) {
        this.timetable = timetable;
    }

    public Aluno[] getStudants() {
        return studants;
    }

    public void setStudants(Aluno[] studants) {
        this.studants = studants;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public void fill()
    {
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Name:");
        this.name = readLine.nextLine();
        
        System.out.println("Semester: ");
        this.semester = readLine.nextLine();
        
        System.out.println("Class Schedule:");
        this.timetable = readLine.nextLine();
        
        this.professor.fill();
        for(int i = 0;i < 30;i++)
            this.studants[i].fill();
    }
    
    public void copy(Class other)
    {
        this.name = other.getName();
        this.semester = other.getSemester();
        this.timetable = other.getTimetable();
        this.studants = other.getStudants();
        this.professor = other.getProfessor();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + Objects.hashCode(this.semester);
        hash = 73 * hash + Objects.hashCode(this.timetable);
        hash = 73 * hash + Arrays.deepHashCode(this.studants);
        hash = 73 * hash + Objects.hashCode(this.professor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Class other = (Class) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.semester, other.semester)) {
            return false;
        }
        if (!Objects.equals(this.timetable, other.timetable)) {
            return false;
        }
        if (!Arrays.deepEquals(this.studants, other.studants)) {
            return false;
        }
        return Objects.equals(this.professor, other.professor);
    }

    @Override
    public String toString() {
        return "Class{" + "name=" + name + ", semester=" + semester + ", timetable=" + timetable + ", studants=" + Arrays.toString(studants) + ", professor=" + professor + '}';
    }
}
