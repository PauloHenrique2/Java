//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
     Motor m1 = new Motor(1, "Motor V8", "1", 1200);

     Carro c1 = new Carro(1, "Golf", "Volkswagen", 2020, m1);

     Acessorio ac1 = new Acessorio(1, "Luz de Neon", 500.67, 2);

     Acessorio ac2 = new Acessorio(2, "Escapamento silencioso", 700.54, 1);

     c1.Ligar();
     c1.Desligar();
     c1.Acelerar();

     c1.acessorios.add(ac1);
     c1.acessorios.add(ac2);
     c1.acessorios.get(0).Ligar();
     c1.acessorios.get(0).Desligar();

     c1.ListarAcessorios();
    }
}