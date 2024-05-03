/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Alunos
 */
public class Fundamental extends Aluno {

    private String notaAux;

    public Fundamental(String nome, Genero genero) {
        super(nome, genero);
    }

    public Fundamental(String nome, int idade, Genero genero, float nota) {
        super(nome, idade, genero, nota);
    }

    @Override
    public String exibirNotas() {
        if (nota <= 6) {
            notaAux = "D";
        } else {
            if (nota > 6 && nota <= 8) {
                notaAux = "C";

            } else {
                if (nota > 8 && nota <= 9) {
                    notaAux = "B";
                } else {
                    if (nota > 9) {
                        notaAux = "A";
                    }
                }
            }
        }
        return notaAux;
    }
}
