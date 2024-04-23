package Circular;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Alunos
 */
public class VetorCircular {

    public int listaVetor(int indice) {
        int i = 0;
        int aux = 0;
        int vetorCircular[] = new int[10];
        for (i = 0; i < indice; i++) {
            if (i % vetorCircular.length == 0) {
                aux = 0;
            } else {
                aux++;
            }
            return vetorCircular[aux - 1];
        }
    }
}
