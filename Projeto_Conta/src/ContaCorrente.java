import java.awt.event.ContainerAdapter;

public class ContaCorrente extends Conta
{
    private String titular;

    private double saldo;


    public ContaCorrente(String titular, double saldo)
    {
     this.titular = titular;
     this.saldo = saldo;
    }

    public String getTitular()
    {
        return this.titular;
    }

    public double getSaldo()
    {
        return this.saldo;
    }

    public void sacar(double val)
    {
        this.saldo -= (val + (val * 0.01));
        System.out.println("Saque realizado! \n Saldo restante: " + getSaldo());
    }

    public void depositar(double val)
    {
        this.saldo += val;
        System.out.println();
    }

    public void transferir(ContaCorrente cc, double val)
    {
        if (getSaldo() < val)
          System.out.println("Saldo insuficiente! \n Insira outro valor.");


        else
        {
            this.saldo -= val;
            cc.depositar(val);
            System.out.println("Transferência concluída! \n Saldo restante: " + getSaldo());
        }
    }
}
