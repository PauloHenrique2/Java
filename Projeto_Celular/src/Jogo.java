public class Jogo {
    private int cod_jogo;
    private String nome;
    private String tipo;
    private double tamanho;

    public Jogo(int cod, String nome, String tipo, double tam) {
        this.cod_jogo = cod;
        this.nome = nome;
        this.tipo = tipo;
        this.tamanho = tam;
    }

    public void Iniciar() {
        System.out.print("Jogo " + this.cod_jogo + " iniciado");
    }

    public void Encerrar() {
        System.out.print("Jogo " + this.cod_jogo + " encerrado");
    }

    public void Listar()
    {
        System.out.println
        (
         "Código: " + this.cod_jogo +
         "Nome: " + this.nome + "\n" +
         "Tipo: " + this.tipo + "\n" +
         "Tamanho: " + this.tamanho + "\n"
        );
    }

    public int getCodJogo()
    {
        return this.cod_jogo;
    }

    public void setCodJogo(int cod)
    {
        this.cod_jogo = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
