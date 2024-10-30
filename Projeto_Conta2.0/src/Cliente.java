import java.lang.ref.Cleaner;

public class Cliente
{
    private String nome;
    private int cpf;
    private String endereco;
    private Conta conta;

    public Cliente(String nome, int cpf, String endereco)
    {
        setNome(nome);
        setCpf(cpf);
        setEndereco(endereco);
    }

    public void setNome(String nome)
    {
      this.nome = nome;
    }

    public String getNome()
    {
      return this.nome;
    }

    public void setCpf(int cpf)
    {
        this.cpf = cpf;
    }

    public int getCpf()
    {
        return this.cpf;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String getEndereco()
    {
        return this.endereco;
    }

    public void setConta(Conta conta)
    {
        this.conta = conta;
    }

    public Conta getConta()
    {
        return this.conta;
    }
}
