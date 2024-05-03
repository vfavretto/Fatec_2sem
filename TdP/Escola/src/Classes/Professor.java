/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Alunos
 */
public final class Professor extends Funcionario {

    private float salarioHora, qtdHoras;

    public Professor(String nome, int idade, Genero genero) {
        super(nome, idade, genero);
    }

    public Professor(String nome, Genero genero) {
        super(nome, genero);
    }

    @Override
    public double calculaSalario() {
        return super.salarioBase + (salarioHora * qtdHoras);
    }

    @Override
    public String getNome() {
        if (super.genero.equals(genero)) {
            return "Professor" + super.nome;
        } else {
            return "Professora" + super.nome;
        }
    }
}
