import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AlunoDAO {
 public static List<Aluno> alunos = new ArrayList<>();

 public static void cadastrar(Aluno aluno) {alunos.add(aluno);}

 public static Optional<Aluno> consultar(int matricula) {
     Optional<Aluno> aluno = alunos.stream().filter(a -> a.getMatricula() == matricula).findFirst();
     return aluno;
 }

 public static void remover(Optional<Aluno> aluno) {alunos.remove(aluno.get());}

 public static void alterar(int matricula, String nome) {
     Optional<Aluno> aluno = consultar(matricula);
     aluno.get().setNome(nome);
     System.out.println("Dados do aluno atualizados!");
 }
}