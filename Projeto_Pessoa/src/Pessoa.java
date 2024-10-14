public class Pessoa
{
 private String nome;

 private int idade;

 private String endereco;

 public Pessoa(String nome, int idade, String end)
 {
     this.nome = nome;
     this.idade = idade;
     this.endereco = end;
 }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
