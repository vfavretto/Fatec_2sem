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
public class Produto {
    private int iD;
    private String nome;
    private String descricao;
    private List<Imposto> imposto;
    private List<Margem> margem;
    private double valorVend;

    public Produto(int iD, String nome, String descricao, List<Imposto> imposto, 
            List<Margem> margem, double valorVend) {
        this.iD = iD;
        this.nome = nome;
        this.descricao = descricao;
        this.imposto = imposto;
        this.margem = margem;
        this.valorVend = valorVend;
    }

    public Produto(int iD, String nome, String descricao, double valorVend) {
        this.iD = iD;
        this.nome = nome;
        this.descricao = descricao;
        this.valorVend = valorVend;
        imposto = new ArrayList();
        margem = new ArrayList();
    }

    public int getiD() {
        return iD;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Imposto> getImposto() {
        return imposto;
    }

    public List<Margem> getMargem() {
        return margem;
    }

    public double getValorVend() {
        return valorVend;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setImposto(List<Imposto> imposto) {
        this.imposto = imposto;
    }

    public void setMargem(List<Margem> margem) {
        this.margem = margem;
    }

    public void setValorVend(double valorVend) {
        this.valorVend = valorVend;
    }

    

}
