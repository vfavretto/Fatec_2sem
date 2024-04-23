/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercvenda;

import java.util.ArrayList;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Imposto IPI = new Imposto("IPI", "Imposto Sobre Servico", 123.00);
        System.out.println(IPI);
        
        ArrayList<Imposto> Impostos = new ArrayList<>();
        Impostos.add(IPI);
       
        
        materiaPrima Cobre = new materiaPrima("Cobre", "Teste", 04.95, Impostos);
        System.out.println(Cobre.getImposto());
        
        Margem comissao = new Margem ("Comissao", "Teste", 05.67);
        
        ArrayList <Margem> Margens = new ArrayList<>();
        Margens.add(comissao);
        
        Produto Moeda = new Produto (1, "Moeda", "teste", Impostos, Margens, 05.68);
        System.out.println("======== PRODUTO FINAL ===========");
        System.out.println(Moeda.getMargem());
        System.out.println(Moeda.getImposto());
        
    }
    
}
