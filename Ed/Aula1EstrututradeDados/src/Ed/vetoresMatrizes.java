package Ed;


public class vetoresMatrizes {
    
public static void main(String[] args) {
    vetoresMatrizes vM1=new vetoresMatrizes();
      int[] entrada=new int [] {0,1,2,3,4,5,6,7};
      int[] saida;
        saida=vM1.inverterVetor(entrada);
        String retorno="";
        String entradaConcatenada= "";

    for(int i=0; i<8;i++) {
        entradaConcatenada += entrada[i];
        retorno+=saida[i];
        }   

        System.out.println("Vetor Entrada " + entradaConcatenada);
        System.out.println("Vetor Saida " + retorno);
        
         int matrizRetorno[][]= vM1.concatenaVetorMatriz (new int [] {0,1,2,3,4,5,6,7}, new int [] {0,1,2,3,4,5,6,7}, new int [] {0,1,2,3,4,5,6,7});
            System.out.println("Fim");
}
   

  public int [] inverterVetor(int[] vetorEntrada) {
        int[] vetorSaida=new int[8];
        
        for (int i=0; i<8;i++) {
            vetorSaida[7-i]=vetorEntrada[i];
        }
        return vetorSaida;
    }

/* *****************EXERCIO 02***************   */

  
  
    
public int [][] concatenaVetorMatriz(int[] vetor1, int[] vetor2, int[] vetor3){
    int[][] matrizSaida=new int[8][3];
    for(int i=0;i<8;i++){
        matrizSaida[i][0]=vetor1[i];
        matrizSaida[i][1]=vetor2[i];
        matrizSaida[i][2]=vetor3[i];
        
        }
    
    return matrizSaida;
    
    }   

}

/* *****************EXERCIO 03***************   */


