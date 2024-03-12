/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa Mae = new Pessoa("");
        Pessoa Pai = new Pessoa ("");
        Pessoa Joao= new Pessoa ("Joao", Mae, Pai);
        Pessoa Irmao = new Pessoa ("Jorel", Mae, Pai);
        Joao.setNome("Joao dos Santos");
        Joao.setCpf ("3333333333");
        Joao.setGenero("Masculino");
        Joao.setTelefone("15 9933333");
        Pai.setNome("Pedro");
        Mae.setNome("Maria");
        Mae.addFilhos(Joao);
        Mae.addFilhos(Irmao);
        
        System.out.println("Nome: " + Joao.getNome());
        System.out.println("Mãe do João: " + Mae.getNome());
        System.out.println("Irmao do Joao: " + Mae.getListaFilhos()[1].getNome());
        System.out.println(Mae.nomeFilhos());
    }
}
