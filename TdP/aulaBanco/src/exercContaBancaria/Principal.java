/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercContaBancaria;

/**
 *
 * @author Alunos
 */
public class  Principal {
    
    
    public static void main(String[] args) {
        Cliente Victor = new Cliente ("Victor", "353900800", "Rua dos Bobos n0");
        System.out.println("Nome Cliente:" + Victor.getNome()+ "\nCPF: " + Victor.getCPF() +"\nEndereço: " + Victor.getEndereço());
        
        
        ContaBancaria victorConta = new ContaBancaria (Victor, "CC", 300.0f, "Aberta");
        
        System.out.println("Saldo inicial: "+ victorConta.getSaldoConta());
        
        victorConta.depositar(360.0f);
        System.out.println("Saldo atual: " + victorConta.getSaldoConta());
        
        victorConta.retirar(100.0f);
        System.out.println("Saldo atual: " + victorConta.getSaldoConta());
        
        System.out.println(victorConta.taxa());
        
        System.out.println(victorConta.extratoConta());
        
        //System.out.println("Cliente: " + victorConta.getClienteA() + "\nTipo da Conta: " + victorConta.getTipoConta() + "\nSaldo da Conta: " + victorConta.getStatusConta());
    }
}
