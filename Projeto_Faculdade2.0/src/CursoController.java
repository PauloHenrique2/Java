import java.util.Optional;
import java.util.Scanner;

public class CursoController {
 public static void Cadastrar() {
     DisciplinaDAO d = new DisciplinaDAO();
     Scanner s = new Scanner(System.in);

     System.out.println("Informe o código: ");
     int codigo = s.nextInt();

     System.out.println("Informe o nome: ");
     String nome = s.next();

     System.out.println("Informe o turno (M ou N):");
     String turno = s.next();

     Curso curso = new Curso(codigo, nome, turno);
     CursoDAO.cadastrar(curso);
 }

 public static void Consultar() {
     Scanner s = new Scanner(System.in);

     System.out.println("Informe o código de um curso a ser consultado: ");
     int codigo = s.nextInt();

     Optional<Curso> curso = CursoDAO.consultar(codigo);

     if (curso.isEmpty()) // Verifica se o valor é vazio
       System.out.println("Curso não encontrado!");


     else {
         System.out.println("Código: " + curso.get().getCodigo());
         System.out.println("Nome: " + curso.get().getNome());
         System.out.println("Turno: " + curso.get().getTurno());
         System.out.println("Disciplinas: ");
         curso.get().listarDisciplinas(); // Lista as disciplinas do curso
     }
 }

 public static void Remover() {
     Scanner s = new Scanner(System.in);
     CursoDAO c = new CursoDAO();

     System.out.println("Informe o código de um curso a ser removido: ");
     int codigo = s.nextInt();

     Optional<Curso> curso = CursoDAO.consultar(codigo);
     CursoDAO.remover(curso);
 }

 public static void Alterar() {
     Scanner s = new Scanner(System.in);
     int opcaoCurso = 0;

     System.out.println("Insira o código de um curso que deseja alterar: ");
     opcaoCurso = s.nextInt();

     System.out.println("Insira o novo nome: ");
     String NewNome = s.next();

     System.out.println("Insira o novo turno (M ou N): ");
     String NewTurno = s.next();

     CursoDAO.alterar(opcaoCurso, NewNome, NewTurno);
 }
}