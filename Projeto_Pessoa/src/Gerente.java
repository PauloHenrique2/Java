public class Gerente
{
 private int senha;

 private int numFuncionariosGerenciados;

 public boolean autentica(int senha)
 {
  if (senha == this.senha)
   return true;
  else
   return false;
 }
}
