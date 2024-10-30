import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Disciplina {
    private int codigo;
    private String nome;
    private String descricao;
    private int cargaHoraria;
    private List<Curso> cursosAssociados = new ArrayList<>();

    public Disciplina(int codigo, String nome, String descricao, int cargaHoraria, Optional<Curso> curso) {
        this.codigo = codigo;
        setNome(nome);
        setDescricao(descricao);
        setCargaHoraria(cargaHoraria);
        addCursosAssociados(curso);
    }

    public int getCodigo() {return this.codigo;}

    public String getNome() {return this.nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getDescricao() {return this.descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public int getCargaHoraria() {return this.cargaHoraria;}

    public void setCargaHoraria(int cargaHoraria) {this.cargaHoraria = cargaHoraria;}

    public void addCursosAssociados(Optional<Curso> curso) {this.cursosAssociados.add(curso.get());}
}