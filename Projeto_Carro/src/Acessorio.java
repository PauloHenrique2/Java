public class Acessorio
{
    public int codigo;
    public String descricao;
    public double valor;
    public int tipo;


    public Acessorio(int cod, String desc, double val, int tipo)
    {
        this.codigo = cod;
        this.descricao = desc;
        this.valor = val;
        this.tipo = tipo;
    }
    public void Ligar()
    {
        System.out.println("Acessório: " + this.codigo + " está ligado!");
    }

    public void Desligar()
    {
        System.out.println("Acessório: " + this.codigo + " está desligado!");
    }
}
