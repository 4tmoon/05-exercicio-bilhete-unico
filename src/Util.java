import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;


public class Util {

    private Bilhete[] bilhete = new Bilhete[5];
    private int index = 0;

    public void menu(){
        String aux = "Escolha uma opção:\n";
        aux += "1 - Emitir bilhete\n";
        aux += "2 - Carregar bilhete\n";
        aux += "3 - Consultar saldo\n";
        aux += "4 - Passar na catraca\n";
        aux += "5 - Finalizar\n";

        int opcao;

        while(true){
            opcao = parseInt(showInputDialog(aux));
            if (opcao == 5){
                break;
            }
            if (opcao < 1 || opcao > 5){
                showMessageDialog(null, "Opção inválida");
            }
            else {
                switch(opcao) {
                    case 1:
                        emitirBilhete();
                        break;
                }
            }
        }
    }

    public void emitirBilhete(){
        String nome = showInputDialog("Nome:");
        String perfil = showInputDialog("Perfil (comum/estudante/professor):");
        long cpf = parseLong(showInputDialog("CPF:"));
        Usuario usuario = new Usuario(nome, perfil, cpf);
        bilhete[index] = new Bilhete(usuario);
        index++;
    }
}