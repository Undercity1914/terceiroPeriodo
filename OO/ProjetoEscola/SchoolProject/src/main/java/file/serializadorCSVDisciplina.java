/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.util.ArrayList;
import java.util.List;
import trabalho.schoolproject.Classes.Lesson;
import trabalho.schoolproject.Classes.Student;

/**
 *
 * @author  igorxf
 */
public class serializadorCSVDisciplina {
     public String toCSV(List<Lesson> disciplinas) {
        String csv = "Nome; ProfM; Semestre; Horario, Alunos\n";
        for (Lesson disc: disciplinas) {
            csv += disc.getName()+ ";"
                    + disc.getTeacher()+ ";"
                    + disc.getSemester()+ ";"
                    + disc.getSchedule()+ ";"
                    + disc.getStudents()+ ";\n";

        }
        return csv;
    }

    public List <Lesson> fromCSV(String data) {
        List <Lesson> disciplinas = new ArrayList<>();

     String[] linhas = data.split("\n");
    for (int i = 1; i < linhas.length; i++) {
        String[] partes = linhas[i].split(";");
        if (partes.length >= 5) {
            List<Student> alunos = new ArrayList<>();
            if (partes[4] != null && !partes[4].isEmpty()) {
                String[] alunosDados = partes[4].split(",");
                for (String alunoDados : alunosDados) {
                    String[] dados = alunoDados.split("-"); // supondo que os dados sejam separados por um "-"
                    if (dados.length == 5) { // Ajuste conforme necessário
                        Student aluno = new Student(Integer.parseInt(dados[0]), Integer.parseInt(dados[1]), dados[2], Integer.parseInt(dados[3]), Integer.parseInt(dados[4]));
                        alunos.add(aluno);
                    }
                }
            }

            Lesson disc = new Lesson(
                partes[0],
                partes[1], 
                partes[2], 
                partes[3],
                alunos
            );
                disciplinas.add(disc);
            }
        }
        return disciplinas;
    }
    
}
