package myproject1.ex01a10.classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Videogame {

    private String titulo;
    private String plataforma;
    private int etaria;
    private double preco;

    public Videogame() {
        this.titulo = " ";
        this.plataforma = " ";
        this.etaria = 0;
        this.preco = 0.0;
    }

    public Videogame(Videogame outra) {
        this.titulo = outra.getTitulo();
        this.plataforma = outra.getPlataforma();
        this.etaria = outra.getEtaria();
        this.preco = outra.getPreco();
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\t\tPreencha\n\n");
        System.out.println("Informe a titulo: ");
        this.titulo = leitor.nextLine();
        System.out.println("Informe o plataforma: ");
        this.plataforma = leitor.next();
        System.out.println("Informe o etaria: ");
        this.etaria = leitor.nextInt();
        System.out.println("Informe a preco: ");
        this.preco = leitor.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Plataforma: " + this.plataforma);
        System.out.println("Preco: " + this.etaria);
        System.out.println("Memoria: " + this.preco);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setEtaria(int etaria) {
        this.etaria = etaria;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getPlataforma() {
        return this.plataforma;
    }

    public int getEtaria() {
        return this.etaria;
    }

    public double getPreco() {
        return this.preco;
    }

}
