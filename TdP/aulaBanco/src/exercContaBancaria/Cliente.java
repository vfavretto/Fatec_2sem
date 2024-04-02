/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercContaBancaria;

/**
 *
 * @author Alunos
 */
public class Cliente {
    
    // ********Variáveis********
    
    private String nome;
    private String CPF;
    private String endereço;
    private Cliente cliTipoA;
    
    // ********Construtores********
    
    public Cliente (String nome){
    this.nome=nome;
    }
    public Cliente (String nome, String CPF){
        this(nome);
        this.CPF=CPF;
    }
    public Cliente (String nome, String CPF, String endereço){
        this(nome, CPF);
        this.endereço=endereço;
    }
    
    // ********Getters********
    
     public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereço() {
        return endereço;
    }
    
    // ********Setters********
    
     public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
}




