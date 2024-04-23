/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercvenda;

/**
 *
 * @author Alunos
 */
public class Imposto {

    private String nome;
    private String descricao;
    private double valorP;

    public Imposto(String nome, String descricao, double valorP) {
        this.nome = nome;
        this.descricao = descricao;
        this.valorP = valorP;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getValorP() {
        return this.valorP;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorP(double valorP) {
        this.valorP = valorP;
    }

    @Override
    public String toString() {
        return "Imposto: " + nome + "(" + descricao + ")" + valorP * 100 + "%";
    }
}
