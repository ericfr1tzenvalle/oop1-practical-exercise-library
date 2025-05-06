/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author Eric
 */
public class Ebook extends Livro {
    private Formato formato;
    private double preco;

    public Ebook(String titulo, String autor, int anoPublicacao, Formato formato, double preco) {
        super(titulo, autor, anoPublicacao);
        this.formato = formato;
        setPreco(preco);
    }

    public Ebook(String titulo, String autor, int anoPublicacao, Editora editora, Formato formato, double preco) {
        super(titulo, autor, anoPublicacao, editora);
        this.formato = formato;
        this.preco = preco;
    }

   
    
    
     private void setPreco(double preco){
        if(preco < 0){
            throw new IllegalArgumentException("preco nao pode ser negativo");
        }
        this.preco = preco;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    @Override
     public String getDescricao(){
        return "Título: " + getTitulo() + " | Autor: " + getAutor() + " | Ano: " + getAnoPublicacao() + " | Preço: R$ " + String.format("%.2f", preco) + "| Formato: " + formato + " " + (this.getEditora() != null ? this.getEditora().toString(): "");
    }
    
    
}
