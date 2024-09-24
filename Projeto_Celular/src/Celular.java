import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

public class Celular {
    private int cod_cel;
    public String marca;
    public String modelo;
    public List<Jogo> jogos = new ArrayList<>();
    private Tela tela;
    private Processador processador;
    private Memoria memoria;

    public Celular(int cod, String marca, String mod, List<Jogo> jogos, Tela tela, Processador proc, Memoria mem)
    {
      this.cod_cel = cod;
      this.marca = marca;
      this.modelo = mod;
      this.jogos = jogos;
      this.tela = tela;
      this.processador = proc;
      this.memoria = mem;
    }

    public void Ligar()
    {
        System.out.print("Celular " + this.cod_cel + " ligado");
    }

    public void Desligar()
    {
        System.out.print("Celular " + this.cod_cel + " desligado");
    }

    public void Chamar()
    {
        System.out.print("Celular " + this.cod_cel + " chamando");
    }

    public void InstalarJogo(Jogo jogo)
    {
        this.jogos.add(jogo);
    }

    public void InstalarJogo(int cod, String nome, String tipo, double tam)
    {
        Jogo jogo = new Jogo(cod, nome, tipo, tam);
        InstalarJogo(jogo);
    }

    public void ListarJogos()
    {
        for(Jogo j : this.jogos)
        {
            j.Listar();
        }
    }

    public int getCodCelular()
    {
        return this.cod_cel;
    }

    public void setCodCelular(int cod)
    {
        this.cod_cel = cod;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }

    public Tela getTela() {
        return tela;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }
}
