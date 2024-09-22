public class Tela {
    private int cod_tela;
    private String descricao;
    private String tipo;
    private double tamanho;

    public Tela(int cod, String desc, String tipo, double tam)
    {
        this.cod_tela = cod;
        this.descricao = desc;
        this.tipo = tipo;
        this.tamanho = tam;
    }

    public void Ligar()
    {
        System.out.print("Tela " + this.cod_tela + " ligada");
    }

    public void Desligar()
    {
        System.out.print("Tela " + this.cod_tela + " desligada");
    }

    public int getCodTela()
    {
        return this.cod_tela;
    }

    public void setCodTela(int cod)
    {
        this.cod_tela = cod;
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

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
