/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.schoolproject.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author marco
 */
public class Lesson 
{
    private String name;
    private String semester;
    private String schedule;
    private String teacher;
    private List<Student> students;

    public Lesson(String name, String semester, String schedule, String teacher, List<Student> students) {
        this.name = name;
        this.semester = semester;
        this.schedule = schedule;
        this.teacher = teacher;
        this.students = students;
    }
    
    public Lesson()
    {
        this.name = "";
        this.semester = "";
        this.schedule = "";
        this.teacher = "";
        this.students = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.semester);
        hash = 43 * hash + Objects.hashCode(this.schedule);
        hash = 43 * hash + Objects.hashCode(this.teacher);
        hash = 43 * hash + Objects.hashCode(this.students);
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
        final Lesson other = (Lesson) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.semester, other.semester)) {
            return false;
        }
        if (!Objects.equals(this.schedule, other.schedule)) {
            return false;
        }
        if (!Objects.equals(this.teacher, other.teacher)) {
            return false;
        }
        return Objects.equals(this.students, other.students);
    }

    @Override
    public String toString() {
        return "Class{" + "name=" + name + ", semester=" + semester + ", schedule=" + schedule + ", teacher=" + teacher + ", students=" + students + '}';
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

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
