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
        Pessoa maeDoJoao = new Pessoa("");
        Pessoa paiDoJoao = new Pessoa ("");
        Pessoa Joao= new Pessoa ("Joao", maeDoJoao, paiDoJoao);
        Pessoa irmaoJoao = new Pessoa ("Jorel", maeDoJoao, paiDoJoao);
        Joao.setNome("Joao dos Santos");
        Joao.setCpf ("3333333333");
        Joao.setGenero("Masculino");
        Joao.setTelefone("15 9933333");
        paiDoJoao.setNome("Pedro");
        maeDoJoao.setNome("Maria");
        maeDoJoao.addFilhos(Joao);
        maeDoJoao.addFilhos(irmaoJoao);
        
        System.out.println("Nome: " + Joao.getNome());
        System.out.println("Mãe do João: " + maeDoJoao.getNome());
        System.out.println("Irmao do Joao: " + maeDoJoao.getListaFilhos()[1].getNome());
        System.out.println(maeDoJoao.nomeFilhos());
    }
}
