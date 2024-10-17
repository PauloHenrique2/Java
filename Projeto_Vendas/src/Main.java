import java.awt.desktop.SystemSleepEvent;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
      Diretor d1 = new Diretor("Pedro Alves");
      Scanner s = new Scanner(System.in);
      int escolha = 0;
      int escolha2 = 0;

      System.out.println("1 - Diretor \n" +
                         "2 - Gerente  \n" +
                         "3 - Vendedor");

      escolha = s.nextInt();

      switch (escolha)
      {
          case 1:
              System.out.println
                     ("1 - Vender \n" +
                      "2 - Imprimir Comprovante \n" +
                      "3 - Cadastrar vendedor \n" +
                      "4 - Cadastrar produto \n" +
                      "5 - Gerenciar financeiro \n" +
                      "6 - Emitir relatório");
              escolha2 = s.nextInt();

              if (Objects.equals(escolha2, 6))
              {
                  escolha2 = 0;
                  System.out.println
                         ("7 - Generico \n" +
                          "8 - Com filtro por produto \n" +
                          "9 - Com filtro por produto e cliente \n" +
                          "10 - Com filtro por produto, cliente e vendedor");
                  escolha2 = s.nextInt();
                  d1.emitirRelatorio(escolha2);
              }
              break;

          case 2:
              escolha2 = 0;
              System.out.println
                      ("1 - Vender \n" +
                       "2 - Imprimir Comprovante \n" +
                       "3 - Cadastrar vendedor \n" +
                       "4 - Cadastrar produto");
              break;

          case 3:
              escolha2 = 0;
              System.out.println
                      ("1 - Vender \n" +
                       "2 - Imprimir Comprovante");
              break;
      }

    }
}