/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serealizar;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Alunos
 */
public class Serealizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Motocicleta motoca = new Motocicleta ("Honda", "GC 150", 100);
        Motocicleta motoca2 = null ;
        System.out.println("Velocidade atual: " + motoca.getVelocidade());
        motoca.alterarVelocidade(1.5f);
        System.out.println("Velocidade atual: " + motoca.getVelocidade());
        
        
        try {
            Serealizador.gravar("motoca.dat", motoca);
        } catch (IOException ex) {
            System.out.println("Erro gravar: " + ex.getMessage());
        }
        motoca.alterarVelocidade(1.5f);
        System.out.println("Velocidade atual: " + motoca.getVelocidade());
        
        try {
            motoca2 = (Motocicleta)Serealizador.ler("motoca.dat");
        } catch (Exception ex) {
            System.out.println("Erro Ler: " + ex.getMessage());
        }
        
        System.out.println("Motoca 2 = " + motoca2.getVelocidade());
    }
    
}
