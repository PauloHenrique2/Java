public class Vendedor
{

 private String nome;

 private String cpf;

 public Vendedor()
 {}

 public Vendedor(String nome, String cpf)
 {
     this.nome = nome;
     this.cpf = cpf;
 }

 public String getNome()
 {
     return this.nome;
 }

 public void vender()
 {
     System.out.println("Venda concluída!");
 }

 public void imprimirComprovante()
 {
     System.out.println("Comprovante impresso!");
 }
}
