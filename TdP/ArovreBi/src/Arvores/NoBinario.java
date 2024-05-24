/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arvores;

/**
 *
 * @author Alunos
 */
public class NoBinario {
    private int info;
    private NoBinario esquerda, direita;
    
    // Construtor
    public NoBinario(int info, NoBinario esquerda, NoBinario direita){
        this.info = info;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public int getInfo() {
        return info;
    }

    public NoBinario getEsquerda() {
        return esquerda;
    }

    public NoBinario getDireita() {
        return direita;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setEsquerda(NoBinario esquerda) {
        this.esquerda = esquerda;
    }

    public void setDireita(NoBinario direita) {
        this.direita = direita;
    }
    
    
}
