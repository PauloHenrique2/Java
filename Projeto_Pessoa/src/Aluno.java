public class Aluno extends Pessoa{
    private int matricula;

    private String curso;

    public Aluno(String nome, int idade, String endereco, int matricula, String curso)
    {
     super(nome, idade, endereco);
     this.matricula = matricula;
     this.curso = curso;
    }

}
