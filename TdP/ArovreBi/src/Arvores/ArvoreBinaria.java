/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arvores;



/**
 *
 * @author Alunos
 */
public class ArvoreBinaria {

    NoBinario raiz;

    public ArvoreBinaria(int info) {
        raiz = new NoBinario(info, null, null);
    }
    
    public void imprimirPreOrdem() {
        imprimirPreOrdem(raiz);
    }
    private void imprimirPreOrdem(NoBinario no){
        System.out.println("No: "+ no.getInfo());
        if(no.getEsquerda()!=null)
            imprimirPreOrdem(no.getEsquerda());
        if(no.getDireita()!=null)
            imprimirPreOrdem(no.getDireita());
    }
    
    public void imprimirOrdem(){
        imprimirOrdem(raiz);
    }
    private void imprimirOrdem(NoBinario no) {
        if (no.getEsquerda() != null) {
            imprimirOrdem(no.getEsquerda());
        }
        System.out.println("No: " + no.getInfo());
        if (no.getDireita() != null) {
            imprimirOrdem(no.getDireita());
        }
    }
    
    public void imprimirPosOrdem(){
        imprimirPosOrdem(raiz);
    }
    private void imprimirPosOrdem(NoBinario no) {
        if (no.getEsquerda() != null) {
            imprimirPosOrdem(no.getEsquerda());
        }
        
        if (no.getDireita() != null) {
            imprimirPosOrdem(no.getDireita());
        
        }
        System.out.println("No: " + no.getInfo());
    }

    //Métodos para adicionar de maneira ordenada
    public void addFilhos(NoBinario no, int valor) {
        if (valor > no.getInfo()) {
            if (no.getDireita() == null) {
                no.setDireita(new NoBinario(valor, null, null));
            } else {
                addFilhos(no.getDireita(), valor);
            }
        } else {
            if (no.getEsquerda() == null) {
                no.setEsquerda(new NoBinario(valor, null, null));
            } else {
                addFilhos(no.getEsquerda(), valor);
            }
        }
    }
    
    public void addNoOrdenado(int valor){
        addNoOrdenado (valor, raiz);
       
    }
    
    private void addNoOrdenado(int valor, NoBinario no){
        //Se valor for menor que o valor do nó
        // adicionamos a esquerda senão a direita
        if(valor < (int)no.getInfo()){
            if(no.getEsquerda() ==null)
                no.setEsquerda(new NoBinario
                    (valor, null, null));
            else
                addNoOrdenado(valor, no.getEsquerda());
        }      
        else{
             if(no.getDireita()==null)
                no.setDireita(new NoBinario
                    (valor, null, null));
            else
                addNoOrdenado(valor, no.getDireita());
        }
       // pela recursão, é só chamar o adicionarFilhos com raiz como parametro
       
    }

    //Método de busca, para descobrir a profundidade da árvore.
  /*  public int getProfundidade(int valor, NoBinario no){ //nó raiz
        int profundidade = 0;
        
        if((int) no.getInfo()== valor){
            return profundidade;
        } else {
            if (no.getDireita() == null){
            
                getProfundidade(valor, no.getEsquerda());
            } else{
                
                if (no.getInfo() == valor){
                    profundidade =+ 1;
                } else{
                    getProfundidade(valor, no.getDireita());
                  
                }
            }
            if (no.getEsquerda() == null){
                
                return profundidade;
            } else{
 
                if (no.getInfo() == valor){
                    profundidade =+ 1;
                } else{
                    getProfundidade(valor, no.getDireita());
                }
            }
        }
        return profundidade;
    }
*/
}
