/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Model;

/**
 *
 * @author Alunos
 */
public  class Pessoa {
    // Atributos
    private String nome, telfone, cpf;

    public Pessoa(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telfone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelfone() {
        return telfone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelfone(String telfone) {
        this.telfone = telfone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
