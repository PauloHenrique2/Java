import java.util.ArrayList;
import java.util.List;

public class Locomotiva
{
    public int cod;
    public String descricao;
    public int tipo;
    public double potencia;
    public List<Farol> farois = new ArrayList<>();

    public Locomotiva(int codigo, String descricao, int tipo, double potencia)
    {
        this.cod = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public void Ligar()
    {System.out.print("Locomotiva " + this.cod + " ligada");}

    public void Desligar()
    {System.out.print("Locomotiva " + this.cod + " desligada");}

    public void Acelerar()
    {System.out.print("Locomotiva " + this.cod + " acelerando");}
}
