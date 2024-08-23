/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.tablemodels;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import trabalho.schoolproject.Classes.Teacher;

/**
 *
 * @author igorxf
 */
public class TMCadProfessor extends AbstractTableModel{
    private List<Teacher> prof;
    
    private final int COL_CPF = 0;
    private final int COL_NOME = 1;
    private final int COL_SEXO = 2;
    private final int COL_IDADE = 3;
    
    public TMCadProfessor(List<Teacher> prof){
        this.prof = prof;
    }
    
    
    @Override
    public int getRowCount() {
        return this.prof.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    
    public Teacher getObjetoAluno(int row){
       return this.prof.get(row);
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Teacher a = this.prof.get(rowIndex);
        switch (columnIndex) {
            case COL_CPF:
                return a.getCpf();
            case COL_NOME:
                return a.getName();
            case COL_SEXO:
                return a.getSex();
            case COL_IDADE:
                return a.getAge();
            default:
                break;
        }
        return "-";
        
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        //qual o nome da coluna
         if(columnIndex == COL_CPF){
            return "CPF";
        }else if(columnIndex == COL_NOME){
            return "Nome";
        }else if(columnIndex == COL_SEXO){
            return "Sexo";
        }else if(columnIndex == COL_IDADE){
            return "Idade";
        }

        return "";
    }

}
