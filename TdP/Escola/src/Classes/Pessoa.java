/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Alunos
 */
public abstract class Pessoa {

    protected String nome;
    public int idade;
    public Genero genero;

    public Pessoa(String nome, Genero genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public Pessoa(String nome, int idade, Genero genero) {
        this(nome, genero);
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public abstract String getNome();

    public int getIdade() {
        return idade;
    }

    public Genero getGenero() {
        return genero;
    }

}
