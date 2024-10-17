public class ContaPoupanca extends Conta
{
    private String titular;

    private double saldo;

    public ContaPoupanca(String titular, double saldo)
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
        this.saldo -= (val + (val * 0.05));
        System.out.println("Saque realizado! \n Saldo restante: " + getSaldo());
    }

    public void depositar(double val)
    {
        this.saldo += (val + (val * 0.10));
        System.out.println();
    }

    public void transferir(ContaPoupanca cp, double val)
    {
        if (getSaldo() < val)
         System.out.println("Saldo insuficiente! \n Insira outro valor.");

        else
        {
            this.saldo -= val;
            cp.depositar(val);
            System.out.println("Transferência concluída! \n Saldo restante: " + getSaldo());
        }
    }
}
