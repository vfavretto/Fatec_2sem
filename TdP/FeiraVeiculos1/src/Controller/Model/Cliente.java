/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Model;

/**
 *
 * @author Alunos
 */
public class Cliente extends Pessoa {
    //Atributos
    private String valorMax, valorMin;
    private String tipoVeiculo;
    
    public Cliente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }
    public Cliente (String nome, String telefone, String cpf, String valorMax, String valorMin, String tipoVeiculo){
        super(nome, telefone, cpf);
        this.valorMax = valorMax;
        this.valorMin = valorMin;
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getValorMax() {
        return valorMax;
    }

    public String getValorMin() {
        return valorMin;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setValorMax(String valorMax) {
        this.valorMax = valorMax;
    }

    public void setValorMin(String valorMin) {
        this.valorMin = valorMin;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    
    
    
    
}
