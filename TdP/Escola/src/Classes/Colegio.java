/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Alunos
 */
public class Colegio extends Aluno {

    public Colegio(String nome, int idade, Genero genero, float nota) {
        super(nome, idade, genero, nota);
    }

    public Colegio(String nome, Genero genero) {
        super(nome, genero);
    }

    @Override
    public String exibirNotas() {
        return String.valueOf(super.nota);
    }
}
