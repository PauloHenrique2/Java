import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
     Banco b1 = new Banco("543627", "Banco do Brasil", "Avenida Amazonas - nº 1765", "3143214876");

     LocalDate d1 = LocalDate.of(2024, 9, 19);
     LocalDate d2 = LocalDate.of(2024, 9, 19);

     Conta c1 = new Conta(1, "Poupança", d1, 100.50f, b1);
     Conta c2 = new Conta(2, "Poupança", d2, 0f, b1);

     Cliente cli1 = new Cliente(1, "Pedro Henrique Ramos", "745326547857", "Rua tupinambás - nº 36", c1);
     Cliente cli2 = new Cliente(2,"Ednaldo Pereira", "53423176548","Rua dos ameridios", c2);

     cli1.imprimirValores();
     cli1.transferirDinheiro(c2, 50f);
     cli2.imprimirValores();
    }
}
