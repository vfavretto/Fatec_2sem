/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    
    // Atributos da Classe
    
    private String nome;
    private String cpf;
    private String genero;
    private String telefone;
    private Pessoa mae;
    private Pessoa pai;
    private Pessoa[] listaFilhos= new  Pessoa [10];
    private int qtdFilhos=0;
    
    // CONSTRUTORES //
    
    public Pessoa (String nome){
        this.nome = nome;
    }
    public Pessoa (String nome, Pessoa mae){
        this(nome);
        this.mae = mae;
    }
    public Pessoa (String nome, Pessoa mae, Pessoa pai){
        this(nome, mae);
        this.pai = pai;
    }
    public Pessoa (String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }
    public Pessoa (String nome, String cpf, String genero){
        this(nome, cpf);
        this.genero = genero;
    }
    public Pessoa (String nome, String cpf, String genero, String telefone){
        this(nome, cpf, genero);
        this.telefone = telefone;
    }
    
    //************* GETTERS ***********
    
    public String getNome(){
        return this.nome;
    }
    public Pessoa getMae(){
        return this.mae;
    }
    public Pessoa getPai(){
        return this.pai;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getGenero(){
        return this.genero;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public Pessoa [] getListaFilhos(){
        return this.listaFilhos;
    }
    
    //********** Setters ***********
    
    public void setNome(String nome){
        this.nome= nome;
    }
    public void setMae(Pessoa mae){
        this.mae=mae;
    }
    public void setPai(Pessoa pai){
        this.pai= pai;
    }
    public void setCpf(String cpf){
        this.cpf= cpf;
    }
    public void setGenero(String genero){
        this.genero= genero;
    }
    public void setTelefone(String telefone){
        this.telefone= telefone;
    }
    
    // METODOS DE INTERFACE (filhos à lista)
    public void addFilhos(Pessoa filho){
        listaFilhos[qtdFilhos]= filho;
        qtdFilhos ++;
    }
    public String nomeFilhos(){
        // METODO PARA RETORNAR LISTA DE FILHOS
        // DE MANEIRA CONCATENADO E SEPARADOS POR ", "
        String mensagem = "O nome dos filhos são: ";
        for(int i=0;i<qtdFilhos; i++)
        {
            mensagem +=listaFilhos[i].getNome();
            if (i < qtdFilhos){
                mensagem+=", ";
        }
    }
        return mensagem;
    }
}