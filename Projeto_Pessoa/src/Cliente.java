public class Cliente extends Pessoa
{
 private double saldo;

 private double limite;

 private double chequeEspecial;

 public void saca(double valor) { this.saldo -= valor; }

 public void depositar(double valor) { this.saldo += valor; }
}
