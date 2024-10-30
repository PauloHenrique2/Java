import java.util.Random;

public class Conta
{
        private int codigo_conta;
        private double saldo;

        public Conta()
        {}

        public Conta(double saldo)
        {
            Random r = new Random();
            this.codigo_conta = r.nextInt(1,100);
            this.saldo = saldo;
        }

        public int getCodigoConta()
        {
            return this.codigo_conta;
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
            System.out.println("Saque realizado! \n Saldo restante: " + getSaldo());
        }

        public void transferir(Conta c, double val)
        {
            if (getSaldo() < val)
                System.out.println("Saldo insuficiente! \n Insira outro valor.");

            else
            {
                this.saldo -= val;
                c.depositar(val);
                System.out.println("Transferência concluída! \n Saldo restante: " + getSaldo());
            }
        }
}
