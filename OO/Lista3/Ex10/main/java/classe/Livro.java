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
public class Livro {
    // título, autor (do tipo Autor), ano de publicação.
    private String nome;
    private int ano;
    private List<Autor> autores;

    public Livro(String nome, int ano, List<Autor> autores) {
        this.nome = nome;
        this.ano = ano;
        this.autores = new ArrayList<>();
    }
    public Livro() {
        this.nome = "";
        this.ano = 0;
        this.autores = new ArrayList<>();
    }
    
    public void copiar(Livro outro){
        this.nome = outro.getNome();
        this.ano = outro.getAno();
          
        for(int i=0; i<= outro.autores.size()-1; i++){
            Autor ai = outro.autores.get(i);
            
            Autor novo = new Autor();
            novo.copiar(ai);                    
            
            this.autores.add(novo);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

     public void addAutor(Autor autor){
        this.autores.add(autor);        
    }
                                                                                
    public void removeAutor(String nomeAutor){
        Autor autor = this.findAutor(nomeAutor);
        this.autores.remove(autor);
    }
    
    public Autor findAutor(String nomeAutor){
        for(Autor autor: this.autores){
            if(autor.getNome().equals(nomeAutor)){
                return autor;
            }
        }
        return null;
    }
    
    public List<Autor> findAuthorByCity(String nomeCidade){
        List<Autor> autoresEncontrados = new ArrayList<>();
        
        for(Autor autor: this.autores){
            if(autor.getCidadeNatal().equals(nomeCidade)){
                autoresEncontrados.add(autor);
            }
        }
        
        return autoresEncontrados;
    
    }
    
    public void imprimir(){
        System.out.println(this.toString());   
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + this.ano;
        hash = 97 * hash + Objects.hashCode(this.autores);
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
        final Livro other = (Livro) obj;
        if (this.ano != other.ano) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.autores, other.autores);
    }
      
}
 