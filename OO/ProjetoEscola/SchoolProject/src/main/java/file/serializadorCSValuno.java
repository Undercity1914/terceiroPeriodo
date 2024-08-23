/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.util.ArrayList;
import java.util.List;
import trabalho.schoolproject.Classes.Student;

/**
 *
 * @author Windows
 */
public class serializadorCSValuno {
    public String toCSV(List<Student> alunos) {
        String csv = "CPF;Matricula;Nome;Idade;Ano Ingresso\n"; 
        for (Student aluno : alunos) {
            csv += aluno.getCpf() + ";"
                    +  aluno.getRegister()+ ";"
                    + aluno.getName() + ";"
                    + aluno.getAge() + ";"
                    + aluno.getYearIn()+ ";\n";
                    
                    
        }
        return csv;
    }
    
    public List <Student> fromCSV(String data) {
        List <Student> alunos = new ArrayList<>();

        String[] linhas = data.split("\n");
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >=4 ) {
                Student aluno = new Student(
                        Integer.parseInt(partes[0]),
                        Integer.parseInt(partes[1]),
                        partes[2],
                        Integer.parseInt(partes[3]),
                        Integer.parseInt(partes[4])
                      
                );

                alunos.add(aluno);
            }
        }
        return alunos;
    }

    
}
