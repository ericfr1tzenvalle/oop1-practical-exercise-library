/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author Eric
 */
public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private Editora editora;

    public Livro(String titulo, String autor, int anoPublicacao) {
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
    }
    public Livro(String titulo, String autor, int anoPublicacao, Editora editora) {
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo == null){
            throw new IllegalArgumentException("titulo nao pode ser nulo");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor == null){
            throw new IllegalArgumentException("autor nao pode ser nulo");
        }
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public Editora getEditora() {
        return editora;
    }
    

    public void setAnoPublicacao(int anoPublicacao) {
    if (anoPublicacao <= 0) {
        throw new IllegalArgumentException("ano nao pode ser zero ou negativo");
    }
    this.anoPublicacao = anoPublicacao;
}
    public String getDescricao(){
         return "Título: " + getTitulo() + " | Autor: " + getAutor() + " | Ano: " + getAnoPublicacao();
    }
  @Override
  public int compareTo(Livro b){
      return this.getTitulo().compareToIgnoreCase(b.titulo);
  }
    public void printBooks(Livro[] books){
  for(Livro b: books){
      System.out.println(b.getDescricao());
}
}

    
    
    
    
    
}
