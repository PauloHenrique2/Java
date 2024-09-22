public class Cliente
{
  private int cod_cliente;
  private String nome;
  private String cpf;
  private String endereco;
  private Conta conta;
  
  public Cliente(int cod, String nome, String cpf, String endereco, Conta conta)
  {
    this.cod_cliente = cod;
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.conta = conta;
  }

  public void imprimirValores()
  {
    System.out.printf("--- Informações da conta ---\n"+
                     "-Código: %d\n"+
                     "-Tipo: %s\n"+
                     "-Data de criação: %s\n"+
                     "-Saldo: %5.2f \n"+
                     "-Banco: %s \n" + "\n", this.conta.getCod_conta(), this.conta.getTipo(), this.conta.getData_criacao().toString(), this.conta.getSaldo(), this.conta.getBanco().nome);
  }

  public void transferirDinheiro(Conta conta, Float val)
  {
   Float saldo = this.conta.getSaldo();
   Float saldo2 = conta.getSaldo();
   saldo -= val;
   saldo2 += val;
   System.out.printf("Transferência concluída!\n Saldo restante: %5.2f \n" + "\n", saldo);
  }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Conta getConta()
    {
      return this.conta;
    }

    public void setConta(Conta conta)
    {
      this.conta = conta;
    }
}
