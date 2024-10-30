import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Curso {
    private int codigo;
    private String nome;
    private String turno;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Curso(int codigo, String nome, String turno) {
     this.codigo = codigo;
     setNome(nome);
     setTurno(turno);
    }

    public int getCodigo() {return this.codigo;}

    public String getNome() {return this.nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getTurno() {return this.turno;}

    public void setTurno(String turno) {this.turno = turno;}

    public void addDisciplina(Disciplina disciplina) {this.disciplinas.add(disciplina);}

    public void removeDisciplina(Optional<Disciplina> disciplina) {
        this.disciplinas.remove(disciplina.get());
    }

    public void listarDisciplinas() {
        for (int i = 0; i < disciplinas.size(); i++) {
            System.out.println(" Nome: " + this.disciplinas.get(i).getNome() +
                               "\n Descrição: " + this.disciplinas.get(i).getDescricao());
        }
    }

    public void listarCursoPorDisciplina(int codigo) {
        Optional<Disciplina> disciplina = DisciplinaDAO.consultar(codigo);

        for (int i = 0; i < this.disciplinas.size(); i++) {
            if (this.disciplinas.contains(disciplina.get())) {
              System.out.println("Nome: " + getNome() + "\n Código: " + getCodigo());
            }
        }
    }
}