/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provalab;


/**
 *
 * @author victor
 */
public class EPI  {

    static String CA;
    static String nome;
    public enum CA{
        PRIMEIRO,
        SEGUNDO,
        TERCEIRO,
        QUARTO;
    }
    public enum nome{
        BOTAS,
        OCULOS,
        CAPACETE,
        PROT_AURICULAR
    }

    public static String getCA() {
        return CA;
    }

    public static String getNome() {
        return nome;
    }
    
    
}
