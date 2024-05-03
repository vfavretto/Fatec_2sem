/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Alunos
 */
public class Main {

    public static void main(String[] args) {
        Aluno victor = new Colegio("Victor", Genero.MASCULINO);
        System.out.println("Nome: " + victor.getNome());
        
        
        Aluno julinha = new Fundamental("Julinha",15 , Genero.FEMININO, 10);
        System.out.println("Nome: " + julinha.exibirNotas());
        
    }
}
