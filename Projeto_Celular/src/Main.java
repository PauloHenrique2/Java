import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
     Tela t1 = new Tela(1, "Tela full hd", "LED", 10);
     Processador p1 = new Processador(1, "Snapdragon 850x","Octa-core",512.0);
     Memoria m1 = new Memoria(1, "Memória Kingston", "RAM", 8012);

     Jogo jg1 = new Jogo(1, "Candy Crush", "Puzzle",500);
     Jogo jg2 = new Jogo(2, "Subway Surfers", "Corrida", 1000);

     Celular c1 = new Celular(1, "Samsung","Galaxy S20", t1, p1, m1);

     c1.InstalarJogo(jg1);
     c1.InstalarJogo(jg2);
     c1.ListarJogos();
    }
}