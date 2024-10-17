public class Main {
    public static void main(String[] args) {
     ContaCorrente cc1 = new ContaCorrente("Pedro Henrique", 50);
     ContaCorrente cc2 = new ContaCorrente("José Alves", 0);

     // cc1.transferir(cc2, 40);

     ContaPoupanca cp1 = new ContaPoupanca("João Pedro", 50);
     ContaPoupanca  cp2 = new ContaPoupanca("Pedro José", 0);

     cp1.transferir(cp2, 51);
    }
}