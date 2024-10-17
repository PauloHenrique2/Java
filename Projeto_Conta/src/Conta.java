public class Conta
{
    private String titular;

    private double saldo;


    public Conta()
    {}

    public Conta(String titular, double saldo)
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
        this.saldo -= val;
        System.out.println("Saque realizado! \n Saldo restante: " + getSaldo());
    }

    public void depositar(double val)
    {
        this.saldo += val;
        System.out.println();
    }
}
