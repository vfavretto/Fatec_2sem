/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercvenda;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Alunos
 */
public class materiaPrima {
    private String nome, descricao;
    private double valorC;
    private List<Imposto> imposto;

    public materiaPrima(String nome, String descricao, double valorC, List imposto) {
        this.nome = nome;
        this.descricao = descricao;
        this.valorC = valorC;
        this.imposto = imposto;
    }
    public materiaPrima(String nome, String descricao, double valorC) {
        this.nome = nome;
        this.descricao = descricao;
        this.valorC = valorC;
        imposto = new ArrayList();
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getValorC() {
        return this.valorC;
    }

    public List<Imposto> getImposto() {
        return this.imposto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorC(double valorC) {
        this.valorC = valorC;
    }

    public void setImposto(List<Imposto> imposto) {
        this.imposto = imposto;
    }
}
