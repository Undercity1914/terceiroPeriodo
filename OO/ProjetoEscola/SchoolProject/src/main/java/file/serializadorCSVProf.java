/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.util.ArrayList;
import java.util.List;
import trabalho.schoolproject.Classes.Teacher;

/**
 *
 * @author  igorxf
 */
public class serializadorCSVProf {
     public String toCSV(List<Teacher> profs) {
        String csv = "Nome;Idade;Sexo;CPF\n"; 
        for (Teacher prof : profs) {
            csv +=    prof.getName() + ";"
                    + prof.getAge() + ";"
                    + prof.getSex() + ";"
                    + prof.getCpf()+ ";\n";
                    
                    
        }
        return csv;
    }

    public List <Teacher> fromCSV(String data) {
        List <Teacher> profs = new ArrayList<>();

        String[] linhas = data.split("\n");
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >=3 ) {
                Teacher profe = new Teacher(
                        partes[0],
                        partes[1],
                        Integer.parseInt(partes[2]),
                        Integer.parseInt(partes[3])
                      
                );
                profs.add(profe);
            }
        }
        return profs;
    }
    
}
