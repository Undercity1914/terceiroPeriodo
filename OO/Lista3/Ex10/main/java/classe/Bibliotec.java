/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Windows
 */
public class Bibliotec {
   private List<Livro> lista;

    public Bibliotec() {
        this.lista = new ArrayList<>();
    }

    public void addBook(Livro livro) {
       this.lista.add(livro);
    }
  
    public void removeBook(String titulo) {
        Livro livro = this.findBookByTitle(titulo);
        this.lista.remove(livro);
    }

    public Livro findBookByTitle(String titulo) {
        for (Livro livro: this.lista) {
            if (livro.getNome().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Livro findBookByAuthor(String nomeAutor) {
        for (Livro livro: lista) {
            Autor autor = livro.findAutor(nomeAutor);
            
            if(autor != null)
                return livro;
        }
        return null;
    }

    public List<Autor> findAuthorByCity(String cidade) {
        List<Autor> lstCompletaAutores = new ArrayList<>();
        
        for (Livro livro: lista) {
            //Busco os autores do livro de acordo com a cidade
            List<Autor> lstAutoresEncontrados = livro.findAuthorByCity(cidade);
            
            //Adiciono na lista completa
            lstCompletaAutores.addAll(lstAutoresEncontrados);            
        }
        return lstCompletaAutores;
    }
    
    public List<Livro> findAllBooks() {        
        return this.lista;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "lista=" + lista + '}';
    }        

}

