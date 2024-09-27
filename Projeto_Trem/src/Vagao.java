import java.util.ArrayList;
import java.util.List;

public class Vagao
{
    public int cod;
    public String descricao;
    public int tipo;
    public boolean conectado;
    public List<Farol> farois = new ArrayList<>();

    public Vagao(int codigo, String descricao, int tipo)
    {
        this.cod = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public void Ligar()
    {System.out.print("Vagão " + this.cod + " ligado");}

    public void Desligar()
    {System.out.print("Vagão " + this.cod + " desligado");}

    public void Conectar()
    {this.conectado = true;}

    public void Desconectar()
    {this.conectado = false;}
}