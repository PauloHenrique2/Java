import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Aluno {
    private String nome;
    private int matricula;
    private Curso curso;

    public Aluno(String nome, int mat, Optional<Curso> curso) {
        setNome(nome);
        this.matricula = mat;
        matricular(curso);
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {
        if (!Objects.equals(nome, "")) // Verifica se o valor de nome está vazio
         this.nome = nome;
        else
         System.out.println("Insira um nome válido!");
    }

    public int getMatricula() {return matricula;}

    public void matricular(Optional<Curso> curso) {this.curso = curso.get();}

    public Curso getCurso() {return this.curso;}
}