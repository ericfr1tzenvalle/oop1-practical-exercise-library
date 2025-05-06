/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Biblioteca;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Eric
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro[] livros = new Livro[5];
        Editora ed1 = new Editora("Nova era", "Tramandaí");
        livros[0] = new Ebook("Grande Sertão: Veredas", "João Guimarães Rosa", 1956, ed1, Formato.MOBI, 79.90);
        livros[1] = new LivroFisico("Dom Casmurro", "Machado de Assis", 1899, 39.50);
        livros[2] = new Ebook("1984", "George Orwell", 1949, Formato.PDF, 45.00);
        livros[3] = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 120.00);
        livros[4] = new LivroFisico("A Revolução dos Bichos", "George Orwell", 1945, 35.75);
        System.out.println("LISTANDO:");
        printBooks(livros);

        //Ordenação padrao por titulo, sobrescrevendo o compareTo.
        Arrays.sort(livros);
        System.out.println("ORDENANDO POR TITULO:");
        printBooks(livros);
        System.out.println("LISTANDO POR ANO (SO ABAIXO DE 1955)");
        for(Livro l: livros){
            if(l.getAnoPublicacao() < 1955){
                System.out.println(l.getDescricao());
            }
        }
        System.out.println("LISTANDO SO OS PDFS");
        for(Livro e: livros){
            if(e instanceof Ebook && ((Ebook) e).getFormato() == Formato.PDF){
                System.out.println(e.getDescricao());
                
            }
        }

    }

    public static void printBooks(Livro[] books) {
        for (Livro b : books) {
            System.out.println(b.getDescricao());
        }
    }

}
