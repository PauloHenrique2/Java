public class Pessoa
{
 private String nome;

 private int idade;

 private int cpf;


 public Pessoa()
 {}
    
 public Pessoa(String nome, int idade, int cpf)
 {
     this.nome = nome;
     this.idade = idade;
     this.cpf = cpf;
 }

 public String getNome() {
        return this.nome;
    }

 public int getIdade() {
        return this.idade;
    }

 public int getCpf() { return this.cpf; }
}
