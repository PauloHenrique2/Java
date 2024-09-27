public class Farol
{
    public int cod;
    public String modelo;
    public double valor;
    public int tipo;

    public Farol(int codigo, String modelo, double valor, int tipo)
    {
        this.cod = codigo;
        this.modelo = modelo;
        this.valor = valor;
        this.tipo = tipo;
    }

    public void Ligar()
    {System.out.print("Farol " + this.cod + " ligado");}

    public void Desligar()
    {System.out.print("Farol " + this.cod + " desligado");}
}
