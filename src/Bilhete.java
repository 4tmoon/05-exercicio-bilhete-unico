import java.util.Random;

public class Bilhete {
    static final double TARIFA = 5.20;
    long numero;
    double saldo;
    Usuario usuario;

    public Bilhete(Usuario usuario){
        numero = gerarNumero();
        this.usuario = usuario;
    }

    private long gerarNumero() {
        Random rd = new Random();
        return rd.nextLong(1000, 10001);
    }

    //método para carregar o bilhete
    public void carregar(double valor){
        saldo += valor;
    }

    //método para consultar o saldo do bilhete
    public double consultarSaldo(){
        return saldo;
    }

    //método para passar na catraca
    public String passarCatraca(){
        double debito = TARIFA / 2;
        if(usuario.perfil.equalsIgnoreCase("comum")){
            debito = TARIFA;
        }
        if(saldo >= debito) {
            saldo -= debito;
            return "Catraca liberada";
        }
        return "Sem saldo";
    }
}


