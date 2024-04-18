/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author Alunos
 */
public class exemplo01 {
    
    private JFrame janela;
    
    public exemplo01(){
        janela = new JFrame("Minha Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 300);
        janela.setVisible(true);
        
    }
    public static void main(String[] args){
        System.out.println("Hello World!");
        exemplo01 p = new exemplo01(); 
    }
}
