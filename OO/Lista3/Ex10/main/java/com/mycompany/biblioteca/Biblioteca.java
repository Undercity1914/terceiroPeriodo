/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import classe.Autor;
import classe.Bibliotec;
import classe.Livro;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Biblioteca {

    
        public static int imprimeMenu() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n\t----------- Biblioteca IFET ------------");
        System.out.println("\t1 - Inserir livro");
        System.out.println("\t2 - Remover livro");
        System.out.println("\t3 - Pesquisar livro (titulo)");
        System.out.println("\t4 - Pesquisar livro (autor)");
        System.out.println("\t5 - Pesquisar Autor (cidadeNatal)");
        System.out.println("\t6 - Listar todos os livros ");
        System.out.println("\t0 - Sair");
        System.out.println("\t-----------------------------------------");
        System.out.print("\tEscolha uma opção:");

        return leitor.nextInt();
    }

    public static void main(String[] args) {
        Bibliotec b = new Bibliotec();
        Scanner leitor = new Scanner(System.in);
        Livro livro = new Livro();
       
        int opcao = 0;
        do {
            opcao = imprimeMenu();

            switch (opcao) {
                case 1: // inserção
                    Livro novoLivro = criarLivroComAutores(leitor);
                    b.addBook(novoLivro);
                    break;

                case 2: // remoção
                    System.out.print("Informe o título do livro a remover: ");
                    String tituloParaRemover = leitor.nextLine();
                    b.removeBook(tituloParaRemover);
                    break;

                case 3: // busca por título
                    System.out.print("Informe o título do livro a pesquisar: ");
                    String tituloParaBuscar = leitor.nextLine();
                    livro = b.findBookByTitle(tituloParaBuscar);
                    livro.imprimir();
                    break;

                case 4: // pesquisa livro pelo nome do autor
                    System.out.print("Informe o nome do autor a pesquisar: ");
                    String nomeAutorParaBuscar = leitor.nextLine();
                    livro = b.findBookByAuthor(nomeAutorParaBuscar);
                    livro.imprimir();
                    break;

                case 5: // pesquisa autor pela cidade natal
                    System.out.print("Informe a cidade natal do autor a pesquisar: ");
                    String cidadeParaBuscar = leitor.nextLine();
                    List<Autor> lstAutores = b.findAuthorByCity(cidadeParaBuscar);
                    
                    //imprimir a lista
                    for(Autor a: lstAutores){
                        System.out.println(a);
                    }
                    break;

                case 6: // listar todos os livros
                    System.out.println(b.toString());
                    break;
            }
        } while (opcao != 0);

        leitor.close();
    }

    private static Livro criarLivroComAutores(Scanner leitor) {
        System.out.println("Informe os dados do livro:");

        System.out.print("Título: ");
        String titulo = leitor.nextLine();

        System.out.print("Ano de publicacao: ");
        int ano = leitor.nextInt();
        leitor.nextLine(); // Limpa o buffer do scanner

        Livro livro = new Livro();

        String resposta = "n";
        do{
            Autor a = criarAutor(leitor);
            livro.addAutor(a);
            
            System.out.print("Existe mais autores neste livro (s/n) ?");
            resposta = leitor.nextLine();            
        }while(resposta.equals("s"));
        

        return livro;
    }

    private static Autor criarAutor(Scanner leitor) {
        System.out.println("Informe os dados do autor:");

        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        System.out.print("Cidade Natal: ");
        String cidadeNatal = leitor.nextLine();

        return new Autor(nome, cidadeNatal);
    }
    }

