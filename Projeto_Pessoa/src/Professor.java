import com.sun.nio.sctp.PeerAddressChangeNotification;

public class Professor extends Pessoa {
    private double salario;

    private String curriculo;

    public Professor(String nome, int idade, String endereco, double salario, String curriculo)
    {
        super(nome, idade, endereco);
        this.salario = salario;
        this.curriculo = curriculo;
    }
}
