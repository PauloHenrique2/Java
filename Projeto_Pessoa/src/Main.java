//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Pessoa p1 = new Pessoa("Pedro José", 20, "Rua dos guajajaras - nº76");

      Aluno a1 = new Aluno("João Pedro", 16, "Rua Tupinambás - nº358", 001, "ADS");

      Professor prof1 = new Professor("Ednaldo Pereira", 35, "Av. Carlos Prates nº345", 10000, "Graduado em Letras pela UFMG");

      a1.getNome();
      a1.getIdade();
      a1.getEndereco();
    }
}