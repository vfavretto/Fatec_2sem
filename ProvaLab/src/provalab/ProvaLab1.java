
package provalab;

/**
 *
 * @author victor
 */
public class ProvaLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa victor = new TecnicoSeguranca ("01", "12345", "1", "Engenheiro", "Nenhum", "Victor", "333-444-555-01", "998667788", "tec01@email.com");
        Pessoa ana = new TecnicoSeguranca ("02", "12345", "2", "Engenheira", "Nenhum", "Ana", "333-444-555-02", "998667799", "tec02@email.com");
        Pessoa felipe = new Comprador ("03", "12345", "3", "Comprador", "Nenhum", "Felipe", "333-444-555-03", "998667700", "comp01@email.com");
        Pessoa murilo = new Comprador ("04", "12345", "4", "Comprador", "Nenhum", "Murilo", "333-444-555-04", "998667710", "comp02@email.com");
        
        
        for (int i = 0; i <= 3; i++) {
            if (i == 0){
                System.out.println(victor.getNome() + "\n" + victor.getCpf());
            }
            if (i == 1){
                System.out.println(ana.getNome()+ "\n" + ana.getCpf() );
            }
            if (i == 2){
                System.out.println(felipe.getNome()+ "\n" + felipe.getCpf() );
            }
            if (i == 3){
                System.out.println(murilo.getNome()+ "\n" + murilo.getCpf() );
            }
            
        }
    }
    
}
