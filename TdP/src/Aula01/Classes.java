/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula01;

/**
 *
 * @author Alunos
 */
    public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Código da Aplicação vai aqui dentro
        
        Pessoa pai;
        pai = new Pessoa("Rodrigo","4444444");
        //pai.nome = "Rodrigo";
        pai.qntFilhos = 2;
        System.out.println(pai.Apresentar()
                + " E possui " + pai.qntIrmaos + " irmãos.");
        
        System.out.println("CPF Pai: " + pai.getCpf());
        pai.setCpf("00000000");
        System.out.println("CPF Pai novo: " + pai.getCpf());
        
       // Pessoa mae = new Pessoa();
       // mae.nome = "Paula";
       // mae.qntFilhos = 2;
        
        /* para mudar o nome de uma variavel em todos locais,
        clica com o direito e seleciona refatorar > renomear */
        
        // se escrever sout e apertar ctrl ele autocompleta o print
        
        //System.out.println(mae.Apresentar());
        // System.out.println(mae.ApresentarFilhos());
        //mae.nomesFilhos[0] = "Maria";
        //mae.nomesFilhos[1] = "João";
        //System.out.println(mae.ApresentarFilhos());
    }
    
}
