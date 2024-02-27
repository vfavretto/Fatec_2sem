/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula01;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    //Atributos da Classe
    String nome;
    int qntFilhos, qntIrmaos;
    String[] nomesFilhos = new String[20];
    private String cpf;
    
    /* METODO CONSTRUTOR */
    public Pessoa (String nome){
        this.nome = "Sr. "+ nome;
    }
    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }
    
    // * METODOS SETTERS * //
    public void setCpf(String cpf){
        //if (this.cpf==null)
        // Verifica se o CPF é Nulo, se sim permite settar
        this.cpf = cpf;
    }
    
    // * METODOS GETTERS * //
    public String getCpf(){
        return this.cpf;
    }
    
    /*Métodos da Classe
    Método "Apresentar", responde com o Nome
    concatenado com a quantidade de Filhos. */
    
    public String Apresentar() {
        return nome + " possui " + qntFilhos + " filhos.";
    }
    
    public String ApresentarFilhos() {
        String resposta = "Meus filhos são ";
        int qntFilhosAux = 0;
        
        for(int i = 0; i < 20; i++) {
            if (nomesFilhos[i] != null) {
                qntFilhosAux++;
                resposta += nomesFilhos[i] + ", ";   
            }           
        }
        
        if (qntFilhosAux > 0) {
            return resposta + "Quantidade de Filhos: " + qntFilhosAux;
        }
        else {
            return "Não possui filhos.";
        }
    }
}
