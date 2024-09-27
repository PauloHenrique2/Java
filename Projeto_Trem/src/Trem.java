import java.util.ArrayList;
import java.util.List;

public class Trem
{
    // Atributos
    public int cod;
    public String modelo;
    public String empresa;
    public Locomotiva locomotiva;
    public List<Vagao> vagoes = new ArrayList<>();

    // Construtor
    public Trem(int codigo, String modelo, String empresa, Locomotiva locomotiva)
    {
        this.cod = codigo;
        this.modelo = modelo;
        this.empresa = empresa;
        this.locomotiva = locomotiva;
    }

    // Métodos
    public void ConectarVagao(Vagao vagao)
    {
        this.vagoes.add(vagao);
    }

    public void DesconectarVagao(Vagao vagao)
    {
        this.vagoes.remove(vagao);
    }

    // Getters e Setters
    public int GetCod()
    {
        return this.cod;
    }

    public void SetCod(int codigo)
    {
        this.cod = codigo;
    }

    public String GetModelo()
    {
        return this.modelo;
    }

    public void SetModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String GetEmpresa()
    {
        return this.empresa;
    }

    public void SetEmpresa(String empresa)
    {
        this.empresa = empresa;
    }

    public Locomotiva GetLocomotiva()
    {
        return this.locomotiva;
    }

    public void SetLocomotiva(Locomotiva locomotiva)
    {
        this.locomotiva = locomotiva;
    }
}
