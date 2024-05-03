/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Alunos
 */
public abstract class Funcionario extends Pessoa {

    protected float salarioBase;

    public Funcionario(String nome, int idade, Genero genero) {
        super(nome, idade, genero);
    }

    public Funcionario(String nome, Genero genero) {
        super(nome, genero);
    }

    public abstract double calculaSalario();

    @Override
    public String getNome() {
        if (super.genero.equals(genero)) {
            return "Sr. " + super.nome;
        } else {
            return "Sra. " + super.nome;
        }
    }

}
