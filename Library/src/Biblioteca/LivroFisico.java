/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author Eric
 */
public class LivroFisico extends Livro {
    private double preco;

    public LivroFisico(String titulo, String autor, int anoPublicacao, double preco) {
        super(titulo, autor, anoPublicacao);
        setPreco(preco);
        
    }

    public LivroFisico(double preco, String titulo, String autor, int anoPublicacao, Editora editora) {
        super(titulo, autor, anoPublicacao, editora);
        setPreco(preco);
    }
    
    private void setPreco(double preco){
        if(preco < 0){
            throw new IllegalArgumentException("preco nao pode ser negativo");
        }
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    @Override
    
    public String getDescricao(){
       return "Título: " + getTitulo() + " | Autor: " + getAutor() + " | Ano: " + getAnoPublicacao() + " | Preço: R$ " + String.format("%.2f", preco) + " " + (this.getEditora() != null ? this.getEditora().toString(): "");
    }
    
    
    
}
