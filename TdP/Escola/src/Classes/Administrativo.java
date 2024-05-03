/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Alunos
 */
public final class Administrativo extends Funcionario {

    private float qtdDias;

    public Administrativo(String nome, Genero genero) {
        super(nome, genero);
    }

    public Administrativo(String nome, int idade, Genero genero) {
        super(nome, idade, genero);
    }

    @Override
    public double calculaSalario() {
        return super.salarioBase * qtdDias;
    }

}
