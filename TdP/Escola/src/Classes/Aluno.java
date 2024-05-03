/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Alunos
 */
public abstract class Aluno extends Pessoa {

    protected float nota;

    public abstract String exibirNotas();

    public Aluno(String nome, Genero genero) {
        super(nome, genero);
    }

    public Aluno(String nome, int idade, Genero genero, float nota) {
        super(nome, idade, genero);
        this.nota = nota;
    }
    

    @Override
    public String getNome() {
        return super.nome;
    }

}
