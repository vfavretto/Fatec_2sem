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
public class ContaBancaria {
    
    //********Atributos********
    
    private Cliente clienteA;
    private String tipoConta;
    private float saldoConta;
    private String statusConta;
    public String extrato = "";

    
    
    //********Construtor********

    public ContaBancaria(Cliente clienteA, String tipoConta, float saldoConta, String statusConta) {
        this.clienteA = clienteA;
        this.tipoConta = tipoConta;
        this.saldoConta = saldoConta;
        this.statusConta = statusConta;
    }
    
    
    //********Getters********
    
    public Cliente getClienteA(){
        return this.clienteA;
    }
    public String getTipoConta(){
        return this.tipoConta;
    }
    public float getSaldoConta(){
        return this.saldoConta;
    }
    public String getStatusConta(){
        return this.statusConta;
    }
    
    
    //********Setters********
    
    public void setClienteA(Cliente clienteA) {
        this.clienteA = clienteA;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }
    public void setStatusConta(String statusConta) {
        this.statusConta = statusConta;
    }
    
    //Metodo depositar
    public void depositar(float valor) {
        saldoConta += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
        extrato += ("\nDepósito de " + valor + " realizado com sucesso.");
    }
    //Metodo retirar
    public void retirar (float valor){
        saldoConta -= valor;
        System.out.println("Retirada de "+ valor + " realizado com sucesso.");
        extrato += ("\nRetirada de "+ valor + " realizado com sucesso.");
    }
    //Metodo verificar saldo
    public void verificar (float valor){
        saldoConta = valor;
        System.out.println("Saldo atual da conta: " + valor);
    }
    //Meotodo Cobrar taxas
    public String taxa() {
       if (tipoConta.equals("CC")) {
           saldoConta -= 19.99;
           System.out.println("Taxa Cobrada: " + 19.99f + "\n");
           extrato += ("\nTaxa Cobrada: " + 19.99f + "\n");
       }
       if (tipoConta.equals("CP")) {
           saldoConta -= 9.99;
           System.out.println("Taxa Cobrada: " + 9.99f + "\n");
           extrato += ("\nTaxa Cobrada: " + 9.99f + "\n");
       }
        return "Novo Saldo: " + saldoConta;
    }
    //Metodo Extrato
    public String extratoConta() {
       return "Extrato da conta: \n" + extrato;
    }
}
