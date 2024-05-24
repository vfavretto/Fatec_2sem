/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arvores;

/**
 *
 * @author Alunos
 */
public class TestarArvore {
    
    public static void main(String[] args) {
        
        ArvoreBinaria arvore = new ArvoreBinaria(100);
        
        arvore.addNoOrdenado(50);
        arvore.addNoOrdenado(30);
        arvore.addNoOrdenado(60);
        arvore.addNoOrdenado(150);
        arvore.addNoOrdenado(120);
        arvore.addNoOrdenado(200);
        /*
        arvore.imprimirPreOrdem(); */
        
        arvore.imprimirPosOrdem();
        
    }
    
    
}
