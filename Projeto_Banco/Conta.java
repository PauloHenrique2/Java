import java.time.LocalDate;

public class Conta
{ 
  private int cod_conta;
  private String tipo;
  private LocalDate data_criacao;
  private Float saldo;
  private Banco banco;

  public Conta(int cod, String tipo, LocalDate dc, Float saldo, Banco banco)
  {
   this.cod_conta = cod;
   this.tipo = tipo;
   this.data_criacao = dc;
   this.saldo = saldo;
   this.banco = banco;
  }

  public void Sacar(Float val)
  {
   this.saldo -= val;
   System.out.println("Valor sacado! Saldo atual: " + this.saldo + "\n");
  }

  public void Depositar(Float val)
  {
    this.saldo += val;
    System.out.println("Valor depositado! Saldo atual: " + this.saldo + "\n");
  }

  public void VerificarSaldo()
  {
    System.out.println("Saldo atual: " + this.saldo + "\n");
  }

    public int getCod_conta() {
        return cod_conta;
    }

    public void setCod_conta(int cod_conta) {
        this.cod_conta = cod_conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDate data_criacao) {
        this.data_criacao = data_criacao;
    }

    public Float getSaldo()
    {
        return this.saldo;
    }

    public void setSaldo(Float saldo)
    {
        this.saldo = saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
