public class Memoria {
    private int cod_mem;
    private  String descricao;
    private String tipo;
    private double capacidade;

    public Memoria(int cod, String desc, String tipo, double cap)
    {
     this.cod_mem = cod;
     this.descricao = desc;
     this.tipo = tipo;
     this.capacidade = cap;
    }

    public void alocar()
    {
        System.out.print("Memória " + this.cod_mem + " alocada");
    }

    public void desalocar()
    {
        System.out.print("Memória " + this.cod_mem + " desalocada");
    }

    public int getCodMemoria()
    {
        return this.cod_mem;
    }

    public void setCodMemoria(int cod)
    {
        this.cod_mem = cod;
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

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
}
