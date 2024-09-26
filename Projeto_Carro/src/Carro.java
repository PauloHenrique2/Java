import java.util.ArrayList;
import java.util.List;

public class Carro
{
    public int codigo;
    public String modelo;
    public String marca;
    public int ano;
    public List<Acessorio> acessorios = new ArrayList<>();

    public Motor motor;

    public Carro(int cod, String mod, String marca, int ano, Motor motor)
    {
        this.codigo = cod;
        this.modelo = mod;
        this.marca = marca;
        this.ano = ano;
        this.motor = motor;
    }

    public void Ligar()
    {
        System.out.println("Motor do carro : " + this.codigo + " está ligado!");
    }

    public void Desligar()
    {
        System.out.println("Motor do carro: " + this.codigo + " está desligado!");
    }

    public void Acelerar()
    {
        System.out.println("Carro: " + this.codigo + " está acelerando!");
    }
}
