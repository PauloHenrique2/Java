public class Processador {
    private int cod_proc;
    private String descricao;
    private String tipo;
    private double velocidade;

    public Processador(int cod, String descricao, String tipo, double vel)
    {
        this.cod_proc = cod;
        this.descricao = descricao;
        this.tipo = tipo;
        this.velocidade = vel;
    }

    public void Acelerar()
    {
        System.out.print("O processador " + this.cod_proc + " está acelerando!");
    }

    public void Desacelerar()
    {
        System.out.print("O processador " + this.cod_proc + " está desacelerando!");
    }

    public int getCodProcessador()
    {
        return this.cod_proc;
    }

    public void setCodProcessdor(int cod)
    {
        this.cod_proc = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
