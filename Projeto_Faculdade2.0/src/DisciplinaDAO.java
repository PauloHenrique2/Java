import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DisciplinaDAO {
    public static List<Disciplina> disciplinas = new ArrayList<>();

    public DisciplinaDAO()
    {}

    public static void cadastrar(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public static Optional<Disciplina> consultar(int codigo) {
        Optional<Disciplina> disciplina = disciplinas.stream().filter(d -> d.getCodigo() == codigo).findFirst();
        return disciplina;
    }

    public static void remover(Optional<Disciplina> disciplina) {
        disciplinas.remove(disciplina.get());
    }

    public static void alterar(int codigo, String nome, String descricao, int cargaHoraria) {
        Optional<Disciplina> disciplina = consultar(codigo);
        disciplina.get().setNome(nome);
        disciplina.get().setDescricao(descricao);
        disciplina.get().setCargaHoraria(cargaHoraria);
        System.out.println("Dados da disciplina atualizados!");
    }

    public void listarDisciplinas() {
        for (int i = 0; i < disciplinas.size(); i++) {
            System.out.println("Código: " + disciplinas.get(i).getCodigo());
            System.out.println("Nome: " + disciplinas.get(i).getNome());
        }
    }
}