/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provalab;

import provalab.EPI.*;

/**
 *
 * @author victor
 */
public abstract class Funcionario extends Pessoa {
    
    
    //Atributos
    private String id;
    private String cargo;
    private String setor;
    
    
    //Construtores
    public Funcionario(String id, String cargo, String setor, String nome, String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
        this.id = id;
        this.cargo = cargo;
        this.setor = setor;
    }
    
    //Solicitar EPI
    public String solicitarEPI(enum nome; enum CA) {
        return "EPI" + (EPI.nome) + "CA" + (EPI.CA) + "solicitado!";
    }
}
