package exerciciosvetores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class ExercVetoresMatrizes {
    
// ****** EXERCICIO 3 ************

    public int convertBinario (int[] entrada){
        int [] decimal = new int[] {128, 64, 32, 16, 8, 4, 2, 1};
        double [] decimalAndreza = new double [8];
        int soma = 0;
            for(int pot = 0; pot<8;pot++){
                decimalAndreza[pot] = Math.pow(2, pot);
                System.out.print(decimalAndreza[pot] + "\t");
                
                soma= soma + (decimal [pot]*entrada[pot]);
            }
            System.out.println("\n ========ENTRADA=======");
            for (int i = 0; i < 8; i++) {
                System.out.print(entrada[i]+"\t");
        }
        System.out.println("\n Resposta: "+ soma);
        return soma;
    }
    
}
