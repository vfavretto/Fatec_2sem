/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provalab;

/**
 *
 * @author victor
 */
public class Comprador extends Funcionario implements iLogin {

    private String idAcesso;
    private String senhaAcesso;

    public Comprador(String idAcesso, String senhaAcesso, String id, String cargo, String setor, String nome, String cpf,
            String telefone, String email) {
        super(id, cargo, setor, nome, cpf, telefone, email);
        this.idAcesso = idAcesso;
        this.senhaAcesso = senhaAcesso;
    }
    
    public String comprarEPI() {

        return "EPI" + EPI.nome + "CA" + EPI.CA + "Comprada!";

    }
    
    @Override
    public boolean Login() {
        return true;
    }
    public boolean Logout(){
        return false;
    }
}
