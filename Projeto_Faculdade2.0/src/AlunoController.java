import java.lang.management.OperatingSystemMXBean;
import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;
import java.util.Optional;

public class AlunoController {
 public static void Cadastrar() {
     Scanner s = new Scanner(System.in);
     CursoDAO c = new CursoDAO();

     System.out.println("Informe a matrícula: ");
     int matricula = s.nextInt();

     System.out.println("Informe o nome: ");
     String nome = s.next();

     System.out.println("Informe o código de um dos cursos abaixo: ");
     c.listarCursos();
     int opcaoCurso = s.nextInt();
     Optional<Curso> curso = CursoDAO.consultar(opcaoCurso);

     Aluno aluno = new Aluno(nome, matricula, curso);
     AlunoDAO.cadastrar(aluno);
 }

 public static void Consultar() {
  Scanner s = new Scanner(System.in);

  System.out.println("Informe a matrícula do aluno a ser consultado: ");
  int matricula = s.nextInt();

  Optional<Aluno> aluno = AlunoDAO.consultar(matricula);

  if (!aluno.isPresent()) {
      System.out.println("Aluno não encontrado!");
  }

  else {
      System.out.println("\n Nome: " + aluno.get().getNome() +
                         "\n Nº de matrícula: " + aluno.get().getMatricula() +
                         "\n Curso: " + aluno.get().getCurso().getNome() +
                         "\n Disciplinas: ");
      aluno.get().getCurso().listarDisciplinas();
  }
 }

 public static void Remover() {
     Scanner s = new Scanner(System.in);

     System.out.println("Informe a matrícula do aluno a ser removido: ");
     int matricula = s.nextInt();

     Optional<Aluno> aluno = AlunoDAO.consultar(matricula);
     AlunoDAO.remover(aluno);
 }

 public static void Alterar() {
     Scanner s = new Scanner(System.in);
     int opcaoAluno = 0;
     AlunoDAO a = new AlunoDAO();

     System.out.println("Insira o código de um dos alunos que deseja alterar: ");
     opcaoAluno = s.nextInt();

     System.out.println("Insira o novo nome: ");
     String NewNome = s.next();

     AlunoDAO.alterar(opcaoAluno, NewNome);
 }
}