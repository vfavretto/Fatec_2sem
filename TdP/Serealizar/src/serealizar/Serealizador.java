/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serealizar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Alunos
 */
public class Serealizador {
    
    //Método gravação, recebe o caminho do arquivo e o objeto
    
    public static void gravar (String endereco, Object obj) throws FileNotFoundException, IOException{
        
        FileOutputStream outFile = new FileOutputStream (endereco);
        ObjectOutputStream s = new ObjectOutputStream (outFile);
        s.writeObject(obj);
        s.close();
    }
    public static Object ler(String endereco) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream inFile = new FileInputStream (endereco);
        ObjectInputStream s = new ObjectInputStream(inFile);
        Object obj = s.readObject();
        s.close();
        return obj;
    }
}
