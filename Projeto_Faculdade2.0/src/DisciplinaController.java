import java.util.Optional;
import java.util.Scanner;

public class DisciplinaController {
    public static void Cadastrar() {
        Scanner s = new Scanner(System.in);
        CursoDAO c = new CursoDAO();

        System.out.println("Informe o código: ");
        int codigo = s.nextInt();

        System.out.println("Informe o nome: ");
        String nome = s.next();

        System.out.println("Informe a descrição: ");
        String descricao = s.next();

        System.out.println("Informe a carga horária: ");
        int carga_horaria = s.nextInt();

        System.out.println("Informe o código de algum dos cursos em que a disciplina será cadastrada: ");
        c.listarCursos();
        int opcaoCurso = s.nextInt();
        Optional<Curso> curso = CursoDAO.consultar(opcaoCurso);

        Disciplina disciplina = new Disciplina(codigo, nome, descricao, carga_horaria, curso);
        DisciplinaDAO.cadastrar(disciplina);
        curso.get().addDisciplina(disciplina); // Adiciona a disciplina à lista de disciplinas do curso
    }

    public static void Consultar() {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o código da disciplina a ser consultada: ");
        int codigo = s.nextInt();

        Optional<Disciplina> disciplina = DisciplinaDAO.consultar(codigo);

        if (!disciplina.isPresent())
            System.out.println("Disciplina não encontrada!");


        else {
            System.out.println("Código: " + disciplina.get().getCodigo());
            System.out.println("Nome: " + disciplina.get().getNome());
            System.out.println("Descrição: " + disciplina.get().getDescricao());
            System.out.println("Carga horária: " + disciplina.get().getCargaHoraria() + "h \n");
        }
    }

    public static void Remover() {
        Scanner s = new Scanner(System.in);
        DisciplinaDAO d = new DisciplinaDAO();

        System.out.println("Informe o código de uma disciplina a ser removida: ");
        int codigo_disciplina = s.nextInt();
        Optional<Disciplina> disciplina = DisciplinaDAO.consultar(codigo_disciplina);

        System.out.println("Informe o código de um dos cursos abaixo que a disciplina será removida: ");
        int codigo_curso = s.nextInt();
        Optional<Curso> curso = CursoDAO.consultar(codigo_curso);
        curso.get().listarCursoPorDisciplina(codigo_disciplina);

        curso.get().removeDisciplina(disciplina); // Remove a disciplina da instância do curso
        DisciplinaDAO.remover(disciplina); // Remove a disciplina da lista de disciplinas
    }

    public static void Alterar() {
        Scanner s = new Scanner(System.in);
        int opcaoDisciplina = 0;

        System.out.println("Insira o código de uma das disciplinas que deseja alterar: ");
        opcaoDisciplina = s.nextInt();

        System.out.println("Insira o novo nome: ");
        String NewNome = s.next();

        System.out.println("Insira a nova descrição: ");
        String NewDescricao = s.next();

        System.out.println("Insira a nova carga horária: ");
        int NewCargaHoraria = s.nextInt();

        DisciplinaDAO.alterar(opcaoDisciplina, NewNome, NewDescricao, NewCargaHoraria);
    }
}