/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author Eric
 */
public class Editora {
    private String nome;
    private String cidadeSede;

    public Editora(String nome, String cidadeSede) {
       setNome(nome);
       setCidadeSede(cidadeSede);
    }
    
    public void setNome(String nome){
        if(nome == null){
            throw new IllegalArgumentException("nome nao pode ser nulo");
        }
        this.nome = nome;
        
    }
    public void setCidadeSede(String cidade){
        if(cidade == null){
            throw new IllegalArgumentException("nome nao pode ser nulo");
        }
        this.cidadeSede = cidade;
        
    }
    @Override
    public String toString(){
        return "Editora: " + nome + " Cidade: " + cidadeSede;
    }
    
    
    
}
