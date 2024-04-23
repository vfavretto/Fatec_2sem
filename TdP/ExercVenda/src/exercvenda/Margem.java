/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercvenda;

/**
 *
 * @author Alunos
 */
public class Margem {
    private String nome;
    private String descricao;
    private double Percentual;

    public Margem(String nome, String descricao, double valorP) {
        this.nome = nome;
        this.descricao = descricao;
        this.Percentual = valorP;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPercentual() {
        return Percentual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPercentual(double Percentual) {
        this.Percentual = Percentual;
    }

    @Override
    public String toString() {
        return "Margem: \n" + nome + "(" + descricao + ")\n" + Percentual * 100 + "%";
    }
    
    
}
