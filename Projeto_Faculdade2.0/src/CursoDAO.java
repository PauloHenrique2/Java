import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CursoDAO {
    public static List<Curso> cursos = new ArrayList<>();

    public CursoDAO() {}

    public static void cadastrar(Curso curso) {cursos.add(curso);}

    public static Optional<Curso> consultar(int codigo) {
        Optional<Curso> curso = cursos.stream().filter(c -> c.getCodigo() == codigo).findFirst();
        return curso;
    }

    public static void remover(Optional<Curso> curso) {cursos.remove(curso.get());}

    public static void alterar(int codigo, String nome, String turno) {
        Optional<Curso> curso = consultar(codigo);
        curso.get().setNome(nome);
        curso.get().setTurno(turno);
        System.out.println("Dados do curso atualizados!");
    }

    public void listarCursos() {
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("\n Código: " + cursos.get(i).getCodigo() +
                               "\n Nome: " + cursos.get(i).getNome() + "\n");
        }
    }
}